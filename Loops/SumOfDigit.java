
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int remainder = 0;
        int temp = n;
        int sum = 0;
        while(temp !=0){
            remainder = temp % 10 ;
            sum += remainder;
            temp /= 10;
        }
        System.out.println("Sum of Digits of " + n + " is " + sum + ".");
    }
    
}
