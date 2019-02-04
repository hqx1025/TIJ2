package com.aihqx.thinkinginjava.chapter12;

/**
 * @author huqingxiang
 * @descrption Practice2
 * @date 2019-01-25 20:34
 */
public class Exception2 {
    public static void main(String[] args) {
        String str = null;
        String[] strs = {"1","2"};
        try {
//            str.toString();
            System.out.println(strs[3]);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
