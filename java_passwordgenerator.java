package com.asproductions.powerfuljava;

import java.util.Random;
import java.util.Scanner;

public class java_passwordgenerator {
    public static void main(String[] args) {
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdeefghijklmnopqrstuvwxyz";
        String num="1234567890";
        String specialchars="~`!@#$%^&*()_+=-;',./<>?:";
        String combination=upper+lower+specialchars+num;
        int len=8;
        char[] password=new char[len];
        Random r=new Random();
        for(int i=0;i<len;i++){
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated password is:"+new String(password) );
    }}

  /*  public static class java_new {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter your good name");
            String name=sc.next();
            System.out.println("Hi " +name);
            System.out.println("How are you");
            String operation=sc.next();
            switch (operation){
                case "I'm not fine" :
                    System.out.println("ohh! What happened with you");
                    break;
                case "By the way how are you" :
                    System.out.println("I'm also doing well");
            }
        }
    }
}*/
