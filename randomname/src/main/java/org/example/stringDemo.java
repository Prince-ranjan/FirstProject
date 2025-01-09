package org.example;

public class stringDemo {

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str);

        System.out.println("Length of str = " + str.length());

        for(int i = 0; i < str.length(); i++) {
            System.out.println("Character at index " + i + " = " + str.charAt(i));;
        }

        String str2 = "HELLO EVERYONE";
        System.out.println(str2.substring(6,11));

        System.out.println(str2.toLowerCase());
    }
}
/*


String :- it is used to store sequence of character

hello everyone
0123456

h e l l o
0 1 2 3 4

String city = "Hyderabad"
city ="Old Hyderabad"


String :- immutable
StringBuilder :- muttable "Old Hyderabad"
StringBuffer :- muttable Thraed Safe

MultiThreading java
Operating System
 */
