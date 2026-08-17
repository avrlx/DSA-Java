package String.SimpleStirng;

public class SringEqual {
    static void main(String[] args) {
        String s = new String("aviral");
        String str = new String("aviral");
        System.out.println(s == str); // this compare the location of string not character
        System.out.println(s.equals(str)); // it compare the string char by char..
    }
}
