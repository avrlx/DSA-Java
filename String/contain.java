package String;

public class contain {
    static void main(String[] args) {
        String s = "harshita";
        boolean a = s.contains("harsh"); // it gives true when it contains the sub-string in 's'
        System.out.println(a);
        a = s.contains("rsh");
        System.out.println(a);
        a = s.contains("shit");
        System.out.println(a);
        a = s.contains("ita");
        System.out.println(a);
        a = s.contains("harsht");
        System.out.println(a);
    }
}
