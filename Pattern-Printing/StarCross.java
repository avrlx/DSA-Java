
import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");  // This code only for odd value of n...
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == j || i + j == n+1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
                
            }
            System.out.println();
        }
    }
    
}
