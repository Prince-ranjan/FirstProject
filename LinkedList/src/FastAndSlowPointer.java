public class FastAndSlowPointer {
    public static int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        int n = nums.length;

        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast) {
                break;
            }
        }

        slow = nums[0];

        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }

    private static LinkedListNode reverselinkedList(LinkedListNode head) {
        LinkedListNode prev = null;

        while (head != null) {
            LinkedListNode next = head.next;
            head.next = prev;
            head = next;
            prev = head;
        }
        return prev;
    }

    public static boolean palindrome(LinkedListNode head) {

        LinkedListNode slow = head;
        LinkedListNode fast =  head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;

        slow = reverselinkedList(slow);

        while(slow != null) {
            if(slow.data != fast.data) return false;

            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
}
