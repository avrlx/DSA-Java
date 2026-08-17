package String.SimpleStirng;

import java.util.Scanner;

public class PrintAllSubstring {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i; j <s.length() ; j++) {
                System.out.println(s.substring(i,j+1));
            }
        }
    }
}
