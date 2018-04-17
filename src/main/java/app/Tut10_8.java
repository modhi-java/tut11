package app;

public class Tut10_8 {
    public static void main(String[] args) {
        Integer num = 123456;
        int len = num.toString().length();
        for (int i = len - 1;i >= 0 ; i--){
            System.out.print(num.toString().charAt(i));
        }
    }
}
