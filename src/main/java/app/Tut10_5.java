package app;

import java.util.Scanner;

public class Tut10_5 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("أدخل الرقم المطلوب");
        int a = abc.nextInt();
       abc(a);
    }
    static void abc(int a ){
        if (a%2==0) {
            System.out.println("الرقم " + a + " يعتبر رقم زوجي ");
        }
        else {
            System.out.println("الرقم "+ a +" يعتبر رقم فردي ") ;
        }


    }
}

