package com.asproductions.powerfuljava;
import java.util.Random;
public class java_revision {
    public static void main(String[] args) {
      String num="1234567890";
      String specialchars="`~!@#$%^&*um;()_-=+][{};'/?><:,";
        String Lower="abcdefghijklmnopqrstuvwxyz";
        String Upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String combination=num+specialchars+Upper+Lower;
      int len=9;
      char [] password=new char[len];
      Random r=new Random();
      for(int i=0;i<len;i++){
          password[i]=combination.charAt(r.nextInt(combination.length()));
          System.out.println("The Password is:"+new String(password));
      }
    }
   }
