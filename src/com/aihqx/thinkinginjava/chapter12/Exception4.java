package com.aihqx.thinkinginjava.chapter12;

/**
 * @author huqingxiang
 * @descrption Practice4
 * @date 2019-01-25 20:41
 */
public class Exception4 extends Exception{
    private String str;
    public Exception4(String message) {
        super(message);
        str = message;
    }

}
class TestException4{
    public static void main(String[] args) {
        try {
            throw new Exception4("Exception4");
        } catch (Exception4 exception4) {
            exception4.printStackTrace();

        }
    }
}