
import java.util.Scanner;

public class MagnitudeSmallerThan69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        if(n < 69 && n > -69) System.out.println("Magnitude of " + n + " is less than 69.");
        else if(n== 69 || n==-69) System.out.println("Magnitude of " + n + " is equal to 69.");
        else System.out.println("Magnitude of " + n + " is not less than 69.");

    }
    
}
