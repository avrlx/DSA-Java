package String.StringBuilder;

public class DeleteSb {
    static void main(String[] args) {
        String s = "aviral";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        sb.delete(3,6); // it delete from 3 to 5...
        System.out.println(sb);
    }
}
