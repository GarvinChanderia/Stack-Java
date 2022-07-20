package com.garvin.soloprojects;

public class Main {
    public static void main(String[] args) {
        implementation i = new implementation();
        i.push(1);
        i.push(2);
        i.push(3);
        i.push(4);
        i.push(5);
        System.out.println(i.peek());
        System.out.println(i.pop());
        System.out.println(i.peek());
    }
}
