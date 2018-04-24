package app;

public class Tut13_1 {
    public static void main(String[] args) {
        String s = "54564445646465";
        int a;
        try {
            System.out.println("s.chrtAt(28): " + s.charAt(28));
            a = Integer.parseInt(s);
        } catch (StringIndexOutOfBoundsException e1) {
            System.out.println("الفهرس المطلوب غير موجود في النص");

            //الأكواد لثلاثة التالية هي لدرس      دوال الكلاس Exception
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
            e1.printStackTrace();
        } catch (NumberFormatException e2) {
            System.out.println("النص لايمكن تحويله إلى رقم لانه ليس من نفس النوع");

        } catch (Exception e3) {
            System.out.println("الأخطاء الغير واردة عي " + e3);
        } finally {

        }
        System.out.println("البرنامج مازال يعمل بشكل صحيح");
    }
}
