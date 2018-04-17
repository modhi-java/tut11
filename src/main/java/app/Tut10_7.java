package app;

import java.util.Scanner;

public class Tut10_7 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("أدخل رقم العملية التي تود القيام بها:");
        System.out.println("1-التحويل من سيليزية إلى فهرنهايتية");
        System.out.println("2-التحويل من فهرنهايتية إلى سيليزية");
       int aktear = abc.nextInt();
       if (aktear==1){
           System.out.println("أدخل الرقم الذي ترغب بتحويله من سيليزية إلى فهرنهايتية");
           double selzih = abc.nextDouble();
           System.out.println("نتيجة التحويل = " + selz(selzih));

       }
       else if (aktear==2){
            System.out.println("أدخل الرقم الذي ترغب بتحويله من فهرنهايتية إلى سيليزية");
            double fhrnhiteh = abc.nextDouble();
            System.out.println("نتيجة التحويل = " + fhrn(fhrnhiteh));

        }

    }

    // (selzاختصار الرجة السيليزية)(fhrnاختصار الدرجة الفهرنهايتية)
  // المتغير لامانع من تكراره بشرط أن يكون التكرار في دوال مختلفة
    // لكن تكرار اسم المتغير في نفس الدالة يسبب مشكلة
    static double selz(double fhrn) {
        double selzih = (9.0 / 5.0) * (fhrn-32);
        return selzih;


    }

    static double fhrn(double selz) {
        double fhrnhit = (5.0 / 9.0) *(selz+32);
        return fhrnhit;
    }
}