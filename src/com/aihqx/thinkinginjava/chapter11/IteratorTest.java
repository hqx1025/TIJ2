package com.aihqx.thinkinginjava.chapter11;

import java.util.*;

/**
 * @author huqingxiang
 * @descrption Practice11
 * @date 2019-01-24 10:15
 */
public class IteratorTest {

    public static void traverseCollection(Collection collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString());

        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(1,2,3));
        Set<Integer> set = new HashSet(list);
        Queue<Integer> queue = new LinkedList(Arrays.asList(7,8,9));
        traverseCollection(list);
        traverseCollection(set);
        traverseCollection(queue);
    }
}
