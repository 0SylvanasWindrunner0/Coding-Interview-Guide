package com.javaman.chap1;

import java.util.Stack;

public class TwoStackQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue(){
        this.stackPush = new Stack<>();
        this.stackPop = new Stack<>();
    }

    public void add(int pushInt){
        stackPush.push(pushInt);
    }

    public int poll(){
        if(stackPop.empty()&&stackPush.empty()){
            throw new RuntimeException("Queue is empty");
        }else if(stackPop.empty()){
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if(stackPop.empty()&&stackPush.empty()){
            throw new RuntimeException("Queue is empty");
        }else if(stackPop.empty()){
            while(!stackPop.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public static void main(String[] args){
        TwoStackQueue twoStackQueue = new TwoStackQueue();
        twoStackQueue.add(1);
        twoStackQueue.add(2);
        twoStackQueue.add(3);
        twoStackQueue.add(4);
        twoStackQueue.add(5);

        System.out.println(twoStackQueue.poll());
        System.out.println(twoStackQueue.peek());
    }
}
