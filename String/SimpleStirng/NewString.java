package String.SimpleStirng;

public class NewString {
    static void main(String[] args) {
        String s = new String("hellow");
        System.out.println(s);// string in java is immutable we cannot change the string .
        // when we concat string it make a new sting after joining them..
        // if we make two string with same value they point the same location until we use the new keyword to make a another copy at other location..
        String s1 = "aviral";
        String s2 = "aviral";
        System.out.println(s1==s2);
    }
}
