package org.example.multiThreading;

public class ThreadUsingRunnableInterface implements Runnable{
    @Override
    public void run(){
        Thread.currentThread().getName();
        try {
           for(int i = 0; i < 5; i++) {
               System.out.println("Thread was sleeping for 2 sec and Thread is created using Runnable Interface");
               Thread.sleep(2000);
           }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
// () -> {}