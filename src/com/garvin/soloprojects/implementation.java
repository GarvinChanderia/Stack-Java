package com.garvin.soloprojects;

public class implementation {
    stack s = new stack();

    boolean isEmpty(){
        return s.top == -1;
    }

    boolean isFull(){
        return s.top == s.maxsize;
    }

    void push(int item){
        if(isFull()){
            System.out.println("Stack Full");
        }
        else {
            s.array[++s.top] = item;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return 0;
        }
        else {
            return s.array[s.top--];
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return 0;
        }
        else {
            return s.array[s.top];
        }
    }
}
