package com.aihqx.thinkinginjava.chapter11;

import java.util.*;

/**
 * @Descrption:
 * @Author: huqingxiang
 * @Date: 2019-01-23 11:00
 */
public class ListIteratorTest {

    public static void main(String[] args) {
        List<Integer> intList0 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> intList1 = new ArrayList<>(Arrays.asList(12,11,10,9,8,7));
        ListIterator listIterator0 = intList0.listIterator(intList0.size());

        LinkedList<Integer> linkedList = new LinkedList<>();
        ListIterator listIterator1 = linkedList.listIterator();

        while (listIterator0.hasPrevious()){
            intList1.add((Integer) listIterator0.previous());
        }
        System.out.println(intList1);

        for (int i = 1; i <= 10; i++) {
            listIterator1.add(i);
            if (i % 2 == 0){
                listIterator1.previous();
            }
        }
        System.out.println(linkedList);

    }
}
