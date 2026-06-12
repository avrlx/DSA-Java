
import java.util.Scanner;

public class APFofNterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of terms : ");
        int n = sc.nextInt();
        int last = 1 + 2 * (n - 1);
        System.out.println("Arithmetic Progression from 1 to " + last + " (" + n + " terms) with common diff of 2");
        for (int i = 1; i <= n; i++) {
            int term = (i-1) * 2 + 1;
            System.out.println( i + " Term - " + term);
            
        }
    }
}
