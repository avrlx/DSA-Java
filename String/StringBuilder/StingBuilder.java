package String.StringBuilder;

public class StingBuilder {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length() + " " + sb.capacity());
        sb.append("hellow"); // we can add text from behind
        System.out.println(sb);
        sb.setCharAt(2,'i'); // we can edit the stringbuilder
        System.out.println(sb);
        String s = sb.toString(); // we can change to string also
        System.out.println(s);


    }
}
