package org.example.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo {

    //Thread = Thread is a lightweight process it works  in background and complete the process.

    // Thread in java is created by two methods  :- Thread Class , Runnable Interface, ThreadPool = ExecutorService

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        long sum = 0;
        for(int i  = 1; i <= 100000000; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();
// 1 Thread
        start = System.currentTimeMillis();

        ThreadUsingThreadClass t5 = new ThreadUsingThreadClass(1,100000000 );
        t5.run();

        end = System.currentTimeMillis();

        System.out.println("Time taken by one Thread " +( end - start));
        System.out.println(t5.getSum());

        // 2 Thread

        start = System.currentTimeMillis();
        ThreadUsingThreadClass t1 = new ThreadUsingThreadClass(1, 50000000);
        ThreadUsingThreadClass t2 = new ThreadUsingThreadClass(50000001, 100000000);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        end = System.currentTimeMillis();
        System.out.println("Time taken by Two Thread " +( end - start));
        System.out.println(t1.getSum() + t2.getSum());

        // 4 threads

        start = System.currentTimeMillis();

        ThreadUsingThreadClass t6 = new ThreadUsingThreadClass(1, 25000000);
        ThreadUsingThreadClass t7 = new ThreadUsingThreadClass(25000001, 50000000);
        ThreadUsingThreadClass t8 = new ThreadUsingThreadClass(50000001, 75000000);
        ThreadUsingThreadClass t9 = new ThreadUsingThreadClass(75000001, 100000000);

        t6.run();
        t7.run();
        t8.run();
        t9.run();

        try {
            t6.join();
            t7.join();
            t8.join();
            t9.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        end = System.currentTimeMillis();
        System.out.println("Time taken by four Thread " +( end - start));
        System.out.println(t6.getSum() + t7.getSum() + t8.getSum() + t9.getSum());








//
//        ThreadUsingRunnableInterface t3 = new ThreadUsingRunnableInterface(1, 50000000);
//        ThreadUsingRunnableInterface t4 = new ThreadUsingRunnableInterface(50000001, 100000000);
//
//        t3.run();
//        t4.run();
//
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println(t3.getSum() + t4.getSum());

    }
}

/*
1- 1000
int sum  = 0;
for(int i = 1; i <= 1000; i++) {
    sum = sum + i;
}

LOCK :-



DeadLock :-
Starvation :-
Race Situation :-

ThreadPool :-
 */