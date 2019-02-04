package com.aihqx.thinkinginjava.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author huqingxiang
 * @descrption Practice17
 * @date 2019-01-24 13:55
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,Gerbil> map = new HashMap<>(3);
        Gerbil gerbil1 = new Gerbil(1,"One");
        Gerbil gerbil2 = new Gerbil(2,"Two");
        Gerbil gerbil3 = new Gerbil(3,"Three");
        map.put(gerbil1.getName(),gerbil1);
        map.put(gerbil2.getName(),gerbil2);
        map.put(gerbil3.getName(),gerbil3);

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key);
            map.get(key).hop();
        }
    }
}
