package app;

public class Tut13_2 {

    public static void main(String[] args) {
        // مما يعني أنها ستقوم برمي إستثناء argument هنا قمنا باستدعاء الدالة و أعطيناها القيمة 70 كـ
        try {
            checkAge(70);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void checkAge (int age) throws Exception {
        if(age > 63) {
            throw new Exception("أنت كبير في السن");
        }
    }

}
