package org.example.multiThreading;

public class ThreadDemo {

    //Thread = Thread is a lightweight process it works  in background and complete the process.

    // Thread in java is created by two methods  :- Thread Class , Runnable Interface, ThreadPool = ExecutorService

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadUsingRunnableInterface());
        t1.start();
    }
}
