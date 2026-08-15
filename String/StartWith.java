package String;

public class StartWith {
    static void main(String[] args) {
        String s = "harshita";
        boolean a = s.startsWith("harsh"); // it gives true only when it starts with the given sub-string
        System.out.println(a);
        a = s.startsWith("rsh");
        System.out.println(a);
        a = s.startsWith("shit");
        System.out.println(a);
        a = s.startsWith("ita");
        System.out.println(a);
        a = s.startsWith("harsht");
        System.out.println(a);
    }
}
