import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find absolute value : ");
        double n = sc.nextDouble();
        double x = Math.abs(n);
        System.out.println("Absolute value of " + n + " is " + x);
    }
}
