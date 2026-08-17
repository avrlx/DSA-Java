package String.StringBuilder;

public class ReverseSB {
    static void main(String[] args) {
        String s = "aviral";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
