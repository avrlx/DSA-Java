
import java.util.Scanner;


public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find square root : ");
        double n = sc.nextDouble();
        double x = Math.sqrt(n);
        System.out.println("Square root of " + n + " is " + x);
    }
}
