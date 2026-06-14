import java.util.Scanner;

public class Ceil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find ceiling value : ");
        double n = sc.nextDouble();
        double x = Math.ceil(n);
        System.out.println("Ceiling value of " + n + " is " + x);
    }
}
