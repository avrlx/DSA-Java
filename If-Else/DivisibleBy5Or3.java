
import java.util.Scanner;

public class DivisibleBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0) System.out.println(n + " is divisible by both 5 and 3.");
        else if(n % 3 == 0) System.out.println(n + " is only divisible by 3.");
        else if(n % 5 == 0) System.out.println(n + " is only divisible by 5.");
        else System.out.println(n + " is neither divisible by 5 nor divisible by 3.");


    }
    
}
