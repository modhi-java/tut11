package app;

import java.util.Scanner;

public class Tut10_9 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ادخل رقم الصفوف: ");
        int row = scanner.nextInt();

        System.out.println("ادخل رقم النجوم بالصف الواحد: ");
        int star = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            printLine(star);
        }
    }

    //طباعة عدد من النجوم في سطر واحد printline
    static void printLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}