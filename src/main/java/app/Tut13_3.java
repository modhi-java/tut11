package app;

public class Tut13_3 {
    public static void main(String[] args) {
        // لأنها قد ترمي إستثناء try و وضعناها بداخل الجملة argument هنا قمنا باستدعاء الدالة و أعطيناها القيمة 70 كـ
        try {
            checkAge(70);
        }
        // ثم تقوم بعرض نوع الخطأ e تلتقط أي إستثناء قد يحدث, بعدها تقوم بتخزينه في الكائن catch هذه الـ
        catch( Exception e ) {
            System.out.println( e.getMessage() );
        }
    }


    // و النص الذي وضعناه بين القوسين عبارة عن شرح للمشكلة التي قد تحدث و هو الذي سيتم عرضه catch أكبر من 63 سيتم رمي إستثناء إلى الدالة age هنا الدالة تقوم بتجربة الكود عند إستدعئها و في حال كانت قيمة
    public static void checkAge (int age) throws Exception{
        if(age > 63) {
            throw new Exception("you are too old!");
        }
    }
}
