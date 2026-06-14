import java.util.Scanner;

public class CubeRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find cube root : ");
        double n = sc.nextDouble();
        double x = Math.cbrt(n);
        System.out.println("Cube root of " + n + " is " + x);
    }
}
