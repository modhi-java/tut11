package app;

public class Tut11 {
    public static void main(String[] args) {

        //تعريف المصفوفة
        int[] intArray;
        long[] longArray;
        double[] doubleArray;
        float[] floatArray;
        String[] stringArray;

        //الطريقة الأولى لإنشاء المصفوفة
        intArray = new int[5];
        intArray[0] = 25;
        intArray[1] = 30;
        intArray[2] = 3;
        intArray[3] = 40;
        intArray[4] = 100;

        //   لانشاء المصفوفة  الطريقة الثانية
        intArray = new int[]{35, 30, 5, 50, 40};
//تستخدم لطباعة كل مكونات المصفوفة

        for (int i = 0; i < intArray.length; i++) {
//طباعة الفهررس

            System.out.println(i);

            //طباعة المكونات داخل المصفوفة
            System.out.println(intArray[i]);


        }

    }
}
