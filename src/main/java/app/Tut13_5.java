package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tut13_5 {
    //تعميم الكائن فى رأس الكلاس لتمكين الدوال الأخري من استدعائه
    private static Scanner scanner;
    //حجز ثلاث مواقع بالذكرة لتخزين المتغيرات المستخدمه فى العمليات الحسابية
    /***
     * ستلاحظ ان التعريف يمكن ان يأخذ صورة اخري :
     * private int num1;
     * private int num2;
     * private int num3;
     */
    private static int num1, num2, result;

    public static void main(String[] args) {

        System.out.println("*****************************************************************");
        System.out.println("***                                                           ***");
        System.out.println("***                     SMART CALCULATOR                      ***");
        System.out.println("***                                                           ***");
        System.out.println("***               DEVELOPED BY: BASSAM ALMAHDY                ***");
        System.out.println("***                                                           ***");
        System.out.println("***                                                           ***");
        System.out.println("*****************************************************************");

        //تعريف كائن من كلاس Scanner عام لإستخدامه فى البرنامج
        scanner = new Scanner(System.in);

        //رسالة ترحيب فى بداية تشغيل البرنامج
        System.out.println("مرحباً بك فى برنامج الحاسبة الذكية!                  ");

        //استدعاء وبدء العملية
        start();

    }

    private static void start() {
        //الطلب من المستخدم اختيار العملية أولاً
        System.out.println("فضلاً قم بادخال رقم العلمية المراد تنفيذها:          ");
        System.out.println("1- الجمـع                                             ");
        System.out.println("2- الطـرح                                             ");
        System.out.println("3- القسمة                                             ");
        System.out.println("4- الضـرب                                             ");
        System.out.println("5- إغــلاق                                             ");

        //الانتظار لادخالات المستخدم وحجز مكان فى الذاكرة لرقم الخيار المحدد
        int option = checkNumber(scanner.nextInt());

        //بدء طلب الرقم الاول من المستخدم وتحزينه فى المتغير سابقاً فى رأس الكلاس
        System.out.println("فضلاً ادخل الرقم الأول:                                 ");

        //استخدام الاستثناءات
        num1 = getNumberFromUser();

        //بدء طلب الرقم الثاني من المستخدم وتحزينه فى المتغير سابقاً فى رأس الكلاس
        System.out.println("فضلاً ادخل الرقم الثاني:                               ");
        num2 = getNumberFromUser();

        //حساب النتيجة واستخراجها وعرضها للمستخدم فى النهاية
        switch (option) {
            case 1:
                //استدعاء دالة الجمع وتخزين النتيجة بالمتغير result
                result = getSum(num1, num2);
                System.out.println("نتيجة عملية جمع الرقمين تساوي =                                  " + result);

                //سؤال المستخدم بخصوص هل يود تكرار العملية مرة أخري أم لا ؟
                askUser();

                break;
            case 2:
                //استدعاء دالة الطرح وتخزين النتيجة بالمتغير result
                result = getSubtract(num1, num2);
                System.out.println("نتيجة عملية طرح الرقمين تساوي =                                  " + result);

                //سؤال المستخدم بخصوص هل يود تكرار العملية مرة أخري أم لا ؟
                askUser();

                break;
            case 3:
                //استدعاء دالة القسمة وتخزين النتيجة بالمتغير result
                result = getDivide(num1, num2);
                System.out.println("نتيجة عملية قسمة الرقمين تساوي =                                  " + result);

                //سؤال المستخدم بخصوص هل يود تكرار العملية مرة أخري أم لا ؟
                askUser();

                break;
            case 4:
                //استدعاء دالة الضرب وتخزين النتيجة بالمتغير result
                result = getMultiply(num1, num2);
                System.out.println("نتيجة عملية ضرب الرقمين تساوي =                                  " + result);

                //سؤال المستخدم بخصوص هل يود تكرار العملية مرة أخري أم لا ؟
                askUser();

                break;
            case 5:
                //الخروج من البرنامج
                System.exit(0);
                break;
        }
    }

    private static void askUser() {
        System.out.println();
        System.out.println();
        System.out.println("هل تود القيام بعملية اخرى؟ (Y/N)                     ");
        //فحص اختيار المستخدم بعد ذلك هل يود تكرار العلمية أم لا
        String yesOrNo = scanner.next();
        if (yesOrNo.equalsIgnoreCase("Y")) {
            start();
        }
        System.out.println();
        System.out.println();
    }

    /**
     * دالة موحدة لأخذ الارقام من المستخدم وإرجاع القيمة المطلوبة بعد انتهاء الفحص والتأكد من صحة نوع القيمة المطلوبة
     */
    public static int getNumberFromUser() {
        //استخدام الاستثناءات
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("فضلاً تأكد من القيمة المدخلة                           ");
            System.out.println("أعد ادخال القيمة مرة أخرى:                           ");
            scanner.nextLine();
            //إعادة استدعاء الدالة حتى يتم التأكد من القيمة المطلوبة
            return getNumberFromUser();
        }
    }

    /***
     * فيما يلي تعريفات الدوال الحسابية والتي تم تجميعها فى دوال لسهولة استدعائها وفت الحاجة إليها
     * من خلال كامل البرنامج ولتقليل حجم السطور المستهلكة داخل الكود وأثناء التنفيذ
     */

    //دالة الجمع
    public static int getSum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    //دالة الطرح
    public static int getSubtract(int num1, int num2) {
        //يمكن ان نستخدم دوال الكلاس Math هنا للتأكد من الطرح لا يرجع قيمة سالبة
        //وذلك بالفحص أولا لأكبر قيمة ومن ثم وضعها فى بداية العملية
        int maxValue = Math.max(num1, num2);
        int minValue = Math.min(num1, num2);
        int result = maxValue - minValue;
        return result;
    }

    //دالة القسمة
    public static int getDivide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    //دالة الضرب
    public static int getMultiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static int checkNumber(int option) {
        if (option < 0 || option > 5) {
            System.out.println("فضلا تأكد من الاختيار الصحيح");
            scanner.nextLine();
            option = getNumberFromUser();
            option = checkNumber(option);
        }
        return option;
    }

}
