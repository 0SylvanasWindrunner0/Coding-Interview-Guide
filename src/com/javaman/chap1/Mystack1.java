package com.javaman.chap1;

import java.util.Stack;

public class Mystack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public  Mystack1(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum <= this.getmin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("your stack is empty");
        }
        int value = this.stackData.pop();
        if(value == this.getmin()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getmin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("your stack is empty");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        Mystack1 mystack1 = new Mystack1();
        mystack1.push(1);
        mystack1.push(2);
        mystack1.push(3);
        mystack1.pop();
        System.out.println("栈的最小值为： " + mystack1.getmin());

    }
}
