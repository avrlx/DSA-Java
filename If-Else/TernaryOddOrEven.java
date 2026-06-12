
import java.util.Scanner;

public class TernaryOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
         System.out.println(n + " is " + ((n % 2 == 0 ) ? "Even." : "Odd."));
        //(n % 2 == 0 ) ? System.out.println("even") : System.out.println("odd");
        // This is not allowed in java...
    }
    
}
