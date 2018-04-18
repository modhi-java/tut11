package app;

public class Tut11_2 {

    public static void main(String[] args) {

        int[] intArray;
        intArray = new int[10];
        int i = 0;
        while (i < 5) {
            intArray[i] = 8;
            i++;

        }
        for (int k = 0; k < intArray.length; k++) {
//طباعة الفهررس

            System.out.println(k);

            //طباعة المكونات داخل المصفوفة
            System.out.println(intArray[k]);


        }
    }

}
