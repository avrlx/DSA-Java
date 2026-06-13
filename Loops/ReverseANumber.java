
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int temp = n;
        int remainder = 0;
        int reverse = 0;
        while(temp != 0){
            remainder = temp % 10 ;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        System.out.println("Reverse of " + n + " is " + reverse);
    }
    
}
