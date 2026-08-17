package String.StringBuilder;

public class ReverseStringWithSb {
    static void main(String[] args) {
        String s = "aviral";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);
    }
}
