
import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of 1st side of triangle : ");
        double a = sc.nextDouble();
        System.out.print("Enter lenght of 2nd side of triangle : ");
        double b = sc.nextDouble();

        System.out.print("Enter lenght of 3rd side of triangle : ");
        double c = sc.nextDouble();
        if(a + b >= c && b + c >= a && c + a >= b) System.out.println(a + ", " + b + ", " + c + ", are 3 side of triangle.");
    else System.out.println(a + ", " + b + ", " + c + ", are not 3 side of triangle.");
    }
    
}
