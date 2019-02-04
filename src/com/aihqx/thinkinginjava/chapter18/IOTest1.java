package com.aihqx.thinkinginjava.chapter18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author huqingxiang
 * @descrption Practice7
 * @date 2019-01-30 11:51
 */
public class IOTest1 {
    public static void read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        List<String> list = new LinkedList();
        while ((s = in.readLine()) != null){
            list.add(s);
        }
        in.close();

        ListIterator listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }

    public static void main(String[] args) throws IOException {
        read("/Users/huqingxiang/IdeaProjects/ThinkingInJavaC11toC21/src/com/aihqx/thinkinginjava/chapter18/iotestfile");
    }
}
