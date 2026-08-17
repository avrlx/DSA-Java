package String.SimpleStirng;

public class ConcatWithPlus {
    static void main(String[] args) {
        String s = "aviral ";
        String s2 = "singh";
        String s3 = s + s2;
        System.out.println(s3);
        System.out.println(10 + 20 + s3);
        System.out.println( s3 + 10 + 20  );
        System.out.println(10 + s3+ 20 );
        System.out.println( s3 + (10 + 20) );
        System.out.println('A' + 10 + s3);
    }
}
