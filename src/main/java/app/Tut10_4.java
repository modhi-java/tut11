package app;

import java.util.Scanner;

public class Tut10_4 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("أدخل قطر الدائرة المراد حساب حجمها");
        double radius = abc.nextDouble();
        System.out.println("حجم الدائرة="+sphereVolume(radius));
    }
    static double sphereVolume (double radius){
        double volume =(4.0/3.0)*Math.pow(radius,3);
        return volume ;


    }
}
