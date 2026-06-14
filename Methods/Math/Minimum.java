import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number : ");
        double b = sc.nextDouble();
        double min = Math.min(a,b);
        System.out.println("Minimum of " + a + " and " + b + " is " + min);
    }
    
}
