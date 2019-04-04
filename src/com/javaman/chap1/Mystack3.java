package com.javaman.chap1;

import java.util.Stack;

/**
 * Created by zhahongsheng on 2019/4/2.
 */
public class Mystack3 {

    public static int  getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.empty()){
            return result;
        }else{
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.empty()){
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 1; i <= 5; ++i){
            stack.push(i);
        }
        reverse(stack);
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
