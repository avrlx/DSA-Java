import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        double a = sc.nextDouble();
        System.out.print("Enter Power : ");
        double b = sc.nextDouble();
        double power = Math.pow(a,b);
        System.out.println( a + " raised to power " +   b + " is " + power);
    }
}
