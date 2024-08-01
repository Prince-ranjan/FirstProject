package org.example;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        System.out.println(stack.peek());

        String str = "Hello Everyone !"; //Last In First out

        Stack<Character> stack1 = new Stack<>();

        // String , String Buffer and String Builder

        char[] charArrayStr = str.toCharArray(); // H e l l o

        for(int i = 0; i < str.length(); i++) {
            stack1.push(charArrayStr[i]);
        }

        for(char c : str.toCharArray()) {
            stack1.push(c); // H e l l o E v e r y o n e !
        }

        while (!stack1.empty()) {
            System.out.print(stack1.pop());
        }

        stack1.push('c');
        if(stack1.empty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("\n\tStack is not empty");
        }
    }
}
