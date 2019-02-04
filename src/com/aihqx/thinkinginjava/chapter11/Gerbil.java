package com.aihqx.thinkinginjava.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Descrption:
 * @Author: huqingxiang
 * @Date: 2019-01-22 14:04
 */
public class Gerbil {
    private int gerbilNumber;
    private String name;
    private static final int SOMEGERBILS = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gerbil(int gerbilNumber, String name) {
        this.gerbilNumber = gerbilNumber;
        this.name = name;
    }

    public void hop(){
        System.out.println(gerbilNumber);
        System.out.println("gerbil jumping!");
    }

    public static void main(String[] args) {
        List<Gerbil> list = new ArrayList<>();
        for (int i = 0;i < SOMEGERBILS;i++){
            list.add(new Gerbil(i,"Spot"));
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Gerbil gerbil = (Gerbil) iterator.next();
            gerbil.hop();
        }
    }
}
