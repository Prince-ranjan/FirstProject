package org.example.multiThreading;

public class ThreadUsingRunnableInterface implements Runnable{

    int start;
    int end;
    long sum = 0;

    public ThreadUsingRunnableInterface(int start, int end) {
        this.start  = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run(){

        for(int i = start; i <= end; i++) {
            sum += i;
        }
//        Thread.currentThread().getName();
//        try {
//           for(int i = 0; i < 5; i++) {
//               System.out.println("Thread was sleeping for 2 sec and Thread is created using Runnable Interface");
//               Thread.sleep(2000);
//           }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
// () -> {}