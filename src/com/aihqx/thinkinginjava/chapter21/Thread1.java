package com.aihqx.thinkinginjava.chapter21;

/**
 * @author huqingxiang
 * @descrption Practice1
 * @date 2019-02-01 08:11
 */
public class Thread1 implements Runnable{

    private int index = 1;
    public Thread1() {
        System.out.println("Thread1 start");
    }

    @Override
    public void run() {
        while (index++ <= 3) {
            System.out.println("running");
            Thread.yield();

        }
        System.out.println("Thread1 end");
    }
}
