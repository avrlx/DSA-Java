import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int i = 1;
        long factorial = 1;
        while(i <= n){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + factorial + ".");
    }
    
}
