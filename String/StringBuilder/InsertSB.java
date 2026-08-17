package String.StringBuilder;

public class InsertSB {
    static void main(String[] args) {
        String s = "aviral";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        sb.insert(4,'s');
        System.out.println(sb);
    }
}
