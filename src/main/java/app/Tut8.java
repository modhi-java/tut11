package app;

public class Tut8 {
    public static void main(String[] asd) {
// قاعدة (while) = طالما

//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
        // قاعدة (for) لكل
        // هذه مختصرة أكثر
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
// قاعدة (do...while)
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10);

        // جملة شرطية (if و else .. إذا كان - غير ذلك)
//        int x = 80;
//        if (x > 60) {
//            System.out.println("ناجح");
//        } else {
//            System.out.println("راسب");
//
//          }

        // جملة شرطية (swich و case .. مفتاح - في حالة)
        String degree = "A";
        switch (degree) {
            case "A":
                System.out.println("ممتاز");
                break;
            case "B":
                System.out.println("جيدجدا");
                break;
            case "C":
                System.out.println("جيد");
                break;
            case "D":
                System.out.println("مقبول");
                break;
            case "F":
                System.out.println("ضعيف");
                break;
        }
    }
}


