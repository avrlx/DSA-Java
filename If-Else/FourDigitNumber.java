
import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        if(n>999 && n<10000) System.out.println(n + " is a 4 Digit number.");
        else System.out.println(n + " is not a 4 Digit number.");
    }
    
}
