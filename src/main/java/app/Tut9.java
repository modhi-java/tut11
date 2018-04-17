package app;

public class Tut9 {
    public static void main (String[]args) {
       // مفهوم الأرقام
//        int i1 = 10 ;
//        Integer i2 = 10 ;
//
//        System.out.println(i2.toString());

//        //لايمكن استخدام أي دوال هنا , أقصد عند الطباعة
//        char c1 = 'B';
//        char c2 = 10 ;
//        //يمكن استخدام دوال هنا , أقصد عند الطباعة
//        Character c11 = 'B';
//        Character c21 = 10 ;
//       // فحص نوع الحرف
//        System.out.println(Character.isLetter(c11));
//        System.out.println(Character.isDigit(c21));


//        System.out.println("\t" + "فهد العنزي");
//        System.out.println("\b" + "sssss");
//        System.out.println("\n" + "aaaaaaa");
//        System.out.println("\r" + "ffffff");
//        System.out.println("\f" + "hhhhh");
//        System.out.println("\'" + "kkkkk");
//        System.out.println("\"" + "oooooo");



//// كود لعد حروف النصوص
//        String name ="java";
//        int namelength = name.length();
//        System.out.println(namelength);
//
//        // كود لمعرفة مكان الحرف حسب الرقم المعطى
//        String name ="java";
//        char namelength = name.charAt(2);
//        System.out.println(namelength);



        //مقارنة نصين
//        String str1 = "فهد1";
//        String str2 = "فهد1";
//
//        int result = str1.compareToIgnoreCase(str2);
//        if (result<0)
//        {
//            System.out.println("\"" + str1 + "\"" + "أقل من" + "\"" + str2 + "\"");
//        }
//        else if (result==0) {
//
//            System.out.println("\"" + str1 + "\"" + "يساوي" + "\"" + str2 + "\"");
//        }
//
//        else{
//            System.out.println("\"" + str1 + "\"" + "أكبر من" + "\"" + str2 + "\"");
//
//        }



        // ربط نصين
        String str1 = "فهد ";
        String str2 = "العنزي ";
        System.out.println("النص الأول " + str1);
        System.out.println("النص الثاني " + str2);
        String str3 = str1.concat(str2);
        System.out.println("النص بعد الربط " + str3);

        // ربط ثلاث نصوص
//        String str1 = "فهد ";
//        String str2 = "حجي ";
//        String str3 = "العنزي ";

        System.out.println("النص الأول " + str1);
        System.out.println("النص الثاني " + str2);
        System.out.println("النص الثالث " + str3);

        String str4 = str1.concat(str2.concat(str3));
        System.out.println("النص بعد الربط " + str4);

    }
}
