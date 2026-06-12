
import java.util.Scanner;

public class GPuptoNterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        long a = 1;
        int r = 2;
        System.out.println("GP ");
        for (int i = 1; i <= n; i++){
            System.out.print(a + " ");
            a *= r;
            
        }
    }
    
}
