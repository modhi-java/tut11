package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tut12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ادخل رقم : ");


        try {
            int x = scanner.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("فضلا تأكد مما تم أدخاله ");
        }

    }
}
