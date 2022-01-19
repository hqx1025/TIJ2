package com.aihqx.thinkinginjava.chapter11;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @descrption Stack Test
 * @author huqingxiang
 * @date 2019-01-23 16:28
 */
public class StackTest {
    private static final Deque<Character> stack1 = new LinkedList<>();
    private static void evaluate(String expr){
        char[] data = expr.toCharArray();
        for (int i = 0; i < data.length;) {
            switch (data[i++]){
                case '+':
                    stack1.push(data[i++]);
                    break;
                case '-':
                    System.out.print(stack1.pop());
                    break;

                    default:
            }
        }

    }

    public static void main(String[] args) {
        evaluate("+U+n+c---+e+r+t---+a+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}
