import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number : ");
        double b = sc.nextDouble();
        double max = Math.max(a,b);
        System.out.println("Maximum of " + a + " and " + b + " is " + max);
    }
}
