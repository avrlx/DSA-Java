import java.util.Scanner;

public class SumAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int remainder = 0;
        int temp = n;
        int sum = 0;
        int reverse = 0;
        while(temp !=0){
            remainder = temp % 10 ;
            sum += remainder;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        if(sum < 0 ) sum = -sum;
        System.out.println("Sum of Digits of " + n + " is " + sum + ".");
        System.out.println("Reverse of " + n + " is " + reverse + ".");

    }
    
    
}
