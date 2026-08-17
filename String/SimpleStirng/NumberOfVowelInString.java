package String.SimpleStirng;

import java.util.Scanner;

public class NumberOfVowelInString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c =0;
        for (int i = 0; i <str.length(); i++) {
            char x = str.charAt(i);
            if (x =='a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                c++;
            }

        }
        System.out.println(c);
    }
}
