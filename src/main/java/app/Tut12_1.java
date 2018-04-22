package app;

public class Tut12_1 {
    public static void main(String[] args) {


        try {
            int[] a = new int[5];
            System.out.println(a[10]);

        } catch (Exception e) {
            System.out.println("الخطأ الذي ظهر:" + e);

        }
        System.out.println(" البرنامج مازال يعمل  بشكل طبيعي");
    }


}

