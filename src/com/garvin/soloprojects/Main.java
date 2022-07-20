package com.garvin.soloprojects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        implementation i = new implementation();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Push \n2.Pop \n3. Peek \n4.Exit");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter int to push");
                    int item = sc.nextInt();
                    i.push(item);
                }
                case 2 -> System.out.println("Popped: " + i.pop());
                case 3 -> System.out.println("Element At Top(Peek): " + i.peek());
                case 4 -> System.exit(0);
            }

        }
    }
}
