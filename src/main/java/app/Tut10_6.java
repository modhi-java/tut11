package app;

import java.util.Scanner;

public class Tut10_6 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("أدخل الرقم الأول");
        int x = abc.nextInt();
        System.out.println("أدخل الرقم الثاني");
        int y = abc.nextInt();
        abc(x , y);
    }
    static void abc(int x , int y ){
        if (x%y==0) {
            System.out.println("الرقم الأول من مضاعفات الرقم الثاني");
        }
        else {
            System.out.println("الرقم الأول ليس من مضاعفات الرقم الثاني") ;
        }


    }
}
