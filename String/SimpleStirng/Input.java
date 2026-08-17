package String.SimpleStirng;

import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for only one word till first space...
        String s = sc.next();
        System.out.println(s);

        // for complete sentence with space...
        String str = sc.nextLine();
        System.out.println(str);
    }



}
