package com.asproductions.powerfuljava;
import java.util.Scanner;
public class java_19 {
    public static void main(String[] args) {
        /*Q-1
        int a=10;
        if(a==11){
            System.out.println("I'm of 11");
        }
        else{
            System.out.println("I'm not of 11");
        }*/
       /*Q-2
        byte m1,m2,m3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1=sc.nextByte();
        System.out.println("Enter your marks in chemistry");
        m2=sc.nextByte();
        System.out.println("Enter your marks in mathematics");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("your overall percentage is:"+ avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, you have been promoted.");
        }
         else{
            System.out.println("Sorry, you have not been promoted! please try again.");
        */
        //Q-3
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your income in lakhs per annum");
       float income = sc.nextFloat();
       float tax= 0;
       if(income<2.5f){
           System.out.println("your tax is");
           tax= tax + 0;
           }else if(income>2.5f && income<=5.0f){
            System.out.println("your tax is");
            tax=tax+ 0.005f*(income-2.5f);

        }   else if(income>5.0f && income<=10.0f){
           System.out.println("your tax is");
           tax = (tax + 0.05f*(5.0f-2.5f));
           tax=tax+0.2f*(income-5.0f);}
              else if(income>10.0f){
           System.out.println("your tax is");
                  tax = tax+0.05f*(5.0f-2.5f);
                  tax=tax+0.2f*(10.0f-5.0f) ;
                  tax=tax+0.3f*(income-10) ;
           System.out.println(tax);
       }
       
        
        //Q-4
      /*  int num;
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
            switch(num){
                case 1:
                       System.out.println("Today is monday");
                       break;
              case 2:
                       System.out.println("Today is tueday");
                        break;
                case 3:
                       System.out.println("Today is wedday");
                        break;
                  case 4 :
                       System.out.println("Today is thruday");
                        break;
                   case 5:
                       System.out.println("Today is friday");
                        break;
                        case 6:
                       System.out.println("Today is saturday");
                        break;
                         case 7:
                       System.out.println("Today is sunday");
             }
             //OR
        switch(num){
        case 1 -> System.out.println("monday");
        case 2 -> System.out.println("tuesday");
        case 3 -> System.out.println("wednesday");
        case 4 -> System.out.println("thrusday");
        case 5 -> System.out.println("friday");
        case 6 -> System.out.println("saturday");
        case 7 -> System.out.println("sunday");
             }       */
        //Q-5
         /*    int year;
             Scanner sc=new Scanner(System.in);
             year=sc.nextInt();
             if(((year % 4) == 0) && (year % 100 == 0))|| ((year % 400)) {
        }){
                 System.out.println("The year is leap year");
             }       else{
                 System.out.println("The year is ordinary  year");
             }
        /*Q-6
        System.out.println("Please enter url of your website");
        Scanner sc =new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")) {
            System.out.println("this is an organisation website");
        }
        else if(website.endsWith(".com")){
            System.out.println("this is an commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("this is an indian website");
        }   */

        }
     }
   
