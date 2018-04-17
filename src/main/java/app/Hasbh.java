package app;

import java.util.Scanner;

public class Hasbh {
    public static void main(String[] qaz) {
        Scanner y = new Scanner(System.in);
        hesab(y);

        System.out.println("للخروج اضغط على زر 0");
        System.out.println("لتكرار العملية اضغط على زر 1");

        chick(y.nextInt(), y);

    }

    private static void hesab(Scanner y) {
        System.out.println("ماهي العملية التي تود القيام بها");
        System.out.println("1-الجمع");
        System.out.println("2-الطرح");
        System.out.println("3-الضرب");
        System.out.println("4-القسمة");
        String hhh=y.next();

        int x1=1;
        int x2=1;
        int x3=1;
        System.out.println("فضلا أدخل الرقم الاول");

        x1 = y.nextInt();
        System.out.println("فضلا أدخل الرقم الثاني");


        x2 = y.nextInt();

        switch (hhh){

            case "1" :
                int ntegh1 = x1 + x2;
                System.out.println("نتيجة الجمع ="+ntegh1);
               break;
            case "2" :
                int ntegh2 = x1 - x2;
                System.out.println("نتيجة الطرح"+ntegh2);
                break;
            case "3" :
                int ntegh3 = x1 * x2;
                System.out.println("نتيجة الضرب"+ntegh3);
                break;
            case "4" :
                int ntegh4 = x1 / x2;
                System.out.println("نتيجة القسمة"+ntegh4);
                break;

        }
    }

    private static void chick(int x1, Scanner s) {
        if (x1 == 0) {
            System.out.println("تم الخروج من البرنامج");
            System.exit(0);

        }
        else {
            hesab(s);
        }
    }
}
