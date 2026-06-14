import java.util.Scanner;

public class MaxOf4Buildin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number : ");
        double b = sc.nextDouble();
        System.out.print("Enter 3rd number : ");
        double c = sc.nextDouble();
        System.out.print("Enter 4th number : ");
        double d = sc.nextDouble();
        double max = Math.max(a,Math.max(b,Math.max(c,d)));
        System.out.println("Maximum of " + a + " , " + b + " , " + c +" and " + d + " is " + max);
    }
}
