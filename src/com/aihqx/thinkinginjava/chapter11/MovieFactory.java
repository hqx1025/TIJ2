package com.aihqx.thinkinginjava.chapter11;

import java.util.*;

/**
 * @descrption
 * @author huqingxiang
 * @date 2019-01-22 14:53
 */
public class MovieFactory {
    String[] arrys = {"Snow White","Start Wars","Hello Mr Tree"};
    int next;
    String next(){
        String movieName = arrys[next];
        next = (next+1) % arrys.length;
        return movieName;
    }

}
class E04_MovieNameGenerator {
    private static final MovieFactory mng =
            new MovieFactory();
    static String[] fill(String[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = mng.next();}
        return array;
    }
    static Collection<String>
    fill(Collection<String> collection) {
        for(int i = 0; i < 5; i++){
            collection.add(mng.next());}
        return collection;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new String[5])));
        System.out.println(fill(new ArrayList()));
        System.out.println(fill(new LinkedList()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println(fill(new TreeSet<>()));
    }
}