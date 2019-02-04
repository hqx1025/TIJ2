package com.aihqx.thinkinginjava.chapter11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author huqingxiang
 * @descrption Practice27
 * @date 2019-01-25 15:46
 */
public class Command {
    private String str;

    public Command(String str) {
        this.str = str;
    }

    public void operation(){
        System.out.println(str);
    }
}
class AddQueue{

    public Queue<Command> commandQueue(){
        Queue<Command> queue = new LinkedList<>();

        queue.offer(new Command("1"));
        queue.offer(new Command("2"));
        queue.offer(new Command("3"));

        return queue;
    }
}

class TestQueue{
    public void showQueue(Queue<Command> queue){
        while (queue.peek() != null){
            queue.poll().operation();
        }
    }

    public static void main(String[] args) {
        AddQueue addQueue = new AddQueue();
        TestQueue testQueue = new TestQueue();
        testQueue.showQueue(addQueue.commandQueue());

    }
}