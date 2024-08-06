package org.example.multiThreading;

public class ThreadUsingThreadClass extends Thread{

    @Override
    public void run() {
        Thread.currentThread().getName();
        try {
            Thread.sleep(2000);
            System.out.println("Thread was sleeping for 2 sec in Thread Class");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
