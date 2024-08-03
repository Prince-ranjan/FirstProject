
import java.util.*;

import static java.util.Collections.swap;

public class Grokking {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
        // Replace this placeholder return statement with your code
    }

    public static boolean findSumOfThree(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
        LinkedListNode node1 = head;

        int i = 0;
        while(i < n && node1.next != null) {
            node1 = node1.next;
            i++;
        }

        LinkedListNode node2 = head;
        while (node1.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }

        node2.next = node2.next.next;

        return head;

    }

    public static int[] sortColors (int[] colors) {

        int start = 0;
        int current = 0;
        int end = colors.length;

        List<Integer> colorList = Arrays.stream(colors).boxed().toList();
        while (current < end) {
            if(colors[current] == 0) {
                swap(colorList,start,current);
                start++;
                current++;
            }
            else if(colors[current] == 1) {
                current++;
            }
            else if(colors[current] == 2) {
                swap(colorList,current,end);
                end--;
            }
        }
        return colorList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static String reverseWholeSentence(String sentence) {
        char[] charArray = sentence.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char c = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = c;
            start++;
            end--;
        }

        return new String(charArray);
    }

    public static String reverseWords(String sentence) {
        sentence = sentence.replaceAll("\\s+", " ").trim();
        String[] words = sentence.split(" ");

        StringBuilder sb   = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if(i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static boolean validWordAbbreviation(String word, String abbr) {
        int i = 0; int j = 0;
        while (i < abbr.length()) {
            if(Character.isDigit(abbr.charAt(i))) {
                if(abbr.charAt(i) == '0') return false;

                int num = 0;

                while (i < abbr.length() && Character.isDigit(abbr.charAt(i))) {
                    num *= 10;
                    num += (abbr.charAt(i) - '0');
                    i++;
                }
                j += num;
            }
            else {
                if(j >= word.length() || word.charAt(j) != abbr.charAt(i)) {
                    return false;
                }
                i++;
                j++;
            }

        }
        return i == abbr.length() && j == word.length();
    }

    public static boolean isPalindromeTwo(String s) {
        int count = 0;

        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else {
                if(count == 1) return false;
                count++;
                left++;
                if(s.charAt(left) == s.charAt(right)) {
                    continue;
                }
                left--;
                right--;
            }
        }
        return true;
    }
    static int getSumOfSquareOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int r = number % 10;
            sum += (r*r);

            number /= 10;
        }
        return sum;
    }

    public static boolean isHappyNumber(int n) {

        int slow = n;
        int fast = getSumOfSquareOfDigits(n);

        while (fast != 1) {
            slow = getSumOfSquareOfDigits(slow);
            fast = getSumOfSquareOfDigits(getSumOfSquareOfDigits(fast));
            if(slow == fast) {
                return false;
            }
        }
        return true;
    }

    public static boolean detectCycle(LinkedListNode head) {
        LinkedListNode slow  = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return  true;
        }

        return false;
     }

    public static LinkedListNode middleNode(LinkedListNode head) {

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while(fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }



}
