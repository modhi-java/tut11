package app;

import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("أصغر قيمة" + smallest(x, y, z)+"\n" );
        System.out.print("أكبر قيمة " + biglest(x, y, z)+"\n" );
    }

    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
    public static double biglest(double x, double y, double z)
    {
        return Math.max(Math.min(x, y), z);
    }
}


