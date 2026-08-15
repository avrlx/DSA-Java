package String;

import java.util.Scanner;

public class CountDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = n + "";
        System.out.println(s.length());
    }
}
