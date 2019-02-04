package com.aihqx.thinkinginjava.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * @Descrption:
 * @Author: huqingxiang
 * @Date: 2019-01-22 14:34
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private List<Object> itemsList;

    public Sequence() {
        itemsList = new ArrayList<>();
    }

    public void add(Object x) {
        itemsList.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() { return i == itemsList.size(); }
        @Override
        public Object current() { return itemsList.get(i); }
        @Override
        public void next() { if(i < itemsList.size()){ i++; }}
    }

    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++){
            sequence.add(Integer.toString(i));}
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
} 


