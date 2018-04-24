package app;

public class Tut13_2 {

    public static void main(String[] args) {
        // مما يعني أنها ستقوم برمي إستثناء argument هنا قمنا باستدعاء الدالة و أعطيناها القيمة 70 كـ
        checkAge(70);
    }


    public static void checkAge (int age) {
        // و النص الذي وضعناه بين القوسين عبارة عن شرح للمشكلة التي قد تحدث و هو الذي سيتم عرضه catch أكبر من 63 سيتم رمي إستثناء إلى الدالة age هنا الدالة تقوم بتجربة الكود و في حال كانت قيمة
        try {
            if(age > 63) {
                throw new Exception("أنت كبير في السن");
            }
        }
        // ثم تقوم بعرض نوع الخطأ e تلتقط أي إستثناء قد يحدث, بعدها تقوم بتخزينه في الكائن catch هذه الـ
        catch( Exception e ) {
            System.out.println( e.getMessage() );
        }
    }

}
