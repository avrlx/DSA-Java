
import java.util.Scanner;

public class PermutationAndCombination {
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            
        }
        return fact;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();
        int combi = factorial(n)/(factorial(r)*factorial(n-r));
        int permu = factorial(n)/factorial(n-r);
        System.out.println("nCr -> " + n + "C" + r + " = " + combi);
        System.out.println("nPr -> " + n + "P" + r + " = " + permu);

    }
    
}
