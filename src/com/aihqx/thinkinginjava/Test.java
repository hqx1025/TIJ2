package com.aihqx.thinkinginjava;

/**
 * @author huqingxiang
 * @descrption
 * @date 2019-02-01 09:08
 */
public class Test {
    void f1(){

    }
    static void f2(){};
}
class Son extends Test{

    static void f4(){}
    void f3(){
        f4();
        f1();
        f2();
    }
}