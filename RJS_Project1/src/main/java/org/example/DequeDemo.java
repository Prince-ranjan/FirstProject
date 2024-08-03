package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);

        deque.offer(2);

        deque.offerFirst(-1);

        System.out.println(deque);
        System.out.println("first = " + deque.peekFirst() + " last = " + deque.peekLast());


    }

    public int maxDepth(String s) {
        int maxDepth = 0;
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(c == '(') {
                deque.offer('(');
                maxDepth = Math.max(maxDepth, deque.size());
            }
            else if(c == ')') {
                deque.peekLast();
            }
        }

        return maxDepth;
    }

    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new ArrayDeque();

        while(head != null) {
            deque.offer(head.val);
            head = head.next;
        }

        System.out.println(deque);
        while(deque.size() >=  2) {
            int first = deque.pollFirst();
            int last = deque.pollLast();
            if(first != last) {
                return false;
            }
        }

        return  true;
    }
}
