package com.aihqx.thinkinginjava.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Descrption:
 * @Author: huqingxiang
 * @Date: 2019-01-23 10:01
 */
public class P7 {
    public static void main(String[] args) {
        MyClass[] mc = new MyClass[10];
        for (int i = 0; i < 10 ; i++) {
            mc[i] = new MyClass();
        }
        List<MyClass> list = new ArrayList<>(Arrays.asList(mc));
        List subList = list.subList(0,2);
        System.out.println(subList);
        list.removeAll(subList);
//        Arrays.asList() 和subList() 返回不可变列表  修改会发生异常
//        subList.clear();
        System.out.println(list);
    }
}

class MyClass{
    private static int counter;
    private int count = counter++;
    @Override
    public String toString(){
        return "MyClass" + count;
    }
}