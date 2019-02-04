package com.aihqx.thinkinginjava.chapter12;

/**
 * @author huqingxiang
 * @descrption Practice1
 * @date 2019-01-25 20:30
 */
public class Exception1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Hi exception");
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        finally {
            System.out.println("finally");
        }
    }
}
