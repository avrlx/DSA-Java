
import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        int a ;
        for (int i = 1; i <= n; i++) {
            a = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
            
        }
    }
    
}
