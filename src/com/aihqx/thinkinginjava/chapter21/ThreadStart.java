package com.aihqx.thinkinginjava.chapter21;

/**
 * @author huqingxiang
 * @descrption
 * @date 2019-02-01 08:25
 */
public class ThreadStart {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Thread2(3)).start();
        }
    }
}
