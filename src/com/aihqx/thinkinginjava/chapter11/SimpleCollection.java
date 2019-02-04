package com.aihqx.thinkinginjava.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @Descrption:
 * @Author: huqingxiang
 * @Date: 2019-01-22 14:31
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        for(int i = 0; i < 10; i++){
            // Autoboxing
            c.add(i); }
        for(Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
