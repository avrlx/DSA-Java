package String.SimpleStirng;

public class toCompare {
    static void main(String[] args) {
        String str = "aviral";
        String str2 = "tanishk";
        int a = str.compareTo(str2);
        System.out.println(a);
        str = "aviral";
        str2 = "avirkl";
        a = str.compareTo(str2);
        System.out.println(a);
        str = "aviral";
        str2 = "avirKl";
        a = str.compareTo(str2);
        System.out.println(a);
        str = "aviral";
        str2 = "aviralsingh";
        a = str.compareTo(str2);
        System.out.println(a);
        str = "aviral";
        str2 = "avi";
        a = str.compareTo(str2);
        System.out.println(a);

    }
}
/*
 it compares the string lexicographically .
 it compares the each of the  string character by character and  returns the differance.
 if equal return 0
 if greater return the positive diff.
 if smaller return the negative diff...
 and if string is  equal till the end of smaller string then it returns the remaining length of the largest string...

 */