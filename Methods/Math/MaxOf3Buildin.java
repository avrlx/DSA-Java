import java.util.Scanner;

public class MaxOf3Buildin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number : ");
        double b = sc.nextDouble();
        System.out.print("Enter 3rd number : ");
        double c = sc.nextDouble();
        double max = Math.max(a,Math.max(b,c));
        System.out.println("Maximum of " + a + " , " + b + " and " + c + " is " + max);
    }
}
