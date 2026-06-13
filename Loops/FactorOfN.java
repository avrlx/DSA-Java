
import java.util.Scanner;

public class FactorOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Nuber : ");
        int n = sc.nextInt();
        System.out.println("Factors of " + n);
        for (int i = 1; i <= n; i++) {
            if(n % i == 0 ){
                System.out.print(i + " ");
            }
        }
    }
    
}
