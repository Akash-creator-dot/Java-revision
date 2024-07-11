package com.asproductions.powerfuljava;
import java.util.Scanner;
public class java_07_D {
    public static void main(String[] args) {
        System.out.println("KILOMETERS TO MILES");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometer");
        float a = sc.nextFloat();
        float miles = a*621/1000;
        System.out.println("MILES");
        System.out.println(miles);
    }
}
