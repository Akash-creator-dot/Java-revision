package com.asproductions.powerfuljava;
import java.util.Scanner;
public class jav_06 {
        public static void main(String[] args) {
            System.out.println("twelfth percentage");
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER NUMBER 1");
            float a = sc.nextFloat();
            System.out.println("ENTER NUMBER 2");
            float b = sc.nextFloat();
            System.out.println("ENTER NUMBER 3");
            float c = sc.nextFloat();
            System.out.println("ENTER NUMBER 4");
            float d = sc.nextFloat();
            System.out.println("ENTER NUMBER 5");
            float e = sc.nextFloat();
            float percentage = (a+b+c+d+e)/5;
            System.out.println(percentage);
        }
    }