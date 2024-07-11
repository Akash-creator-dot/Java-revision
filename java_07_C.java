package com.asproductions.powerfuljava;
import java.util.Scanner;
public class java_07_C {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello how are you " + name );
    }
}
