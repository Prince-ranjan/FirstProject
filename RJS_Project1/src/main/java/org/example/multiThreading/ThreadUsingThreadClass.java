package org.example.multiThreading;

public class ThreadUsingThreadClass extends Thread{

    int start;
    int end;
    long sum = 0;

    public ThreadUsingThreadClass(int start, int end) {
        this.start  = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {

        for(int i = start; i <= end; i++) {
            sum += i;
        }

    }
}
