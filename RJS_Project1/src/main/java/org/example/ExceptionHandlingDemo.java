package org.example;

public class ExceptionHandlingDemo {





    public static void main(String[] args) {

        try {
            int x = 10/0;
            System.out.println("No Exception Caught");
        } catch (Exception e) {
            System.out.println("An Exception has occurred we are working on the fix it seems like you are trying to divide a number by zero");
        }
        finally {
            System.out.println("Finally Block is getting called !");
        }

        try {
            int x = 10/1;
            System.out.println("No Exception Caught");
        } catch (Exception e) {
            System.out.println("An Exception has occurred we are working on the fix it seems like you are trying to divide a number by zero");
        }

        try {
            int x = 10/1;
            System.out.println("No Exception Caught");
        }
        finally {
            System.out.println("Finally Block is getting called !");
        }


        int[] arr = {1,2,3,4,5};


    }


}
