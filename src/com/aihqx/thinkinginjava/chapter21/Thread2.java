package com.aihqx.thinkinginjava.chapter21;

/**
 * @author huqingxiang
 * @descrption Practice2
 * @date 2019-02-01 08:36
 */
public class Thread2 extends Thread{
    private int fiboNum;
    public Thread2(int n) {
        fiboNum = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= fiboNum; i++) {
            System.out.println(fib(i));
        }
    }
    private int fib(int n) {
        if(n < 2){ 
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }
}
