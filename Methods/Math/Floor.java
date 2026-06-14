import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find floor value : ");
        double n = sc.nextDouble();
        double x = Math.floor(n);
        System.out.println("Floor value of " + n + " is " + x);
    }
}
