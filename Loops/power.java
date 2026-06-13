
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base number : ");
        int a = sc.nextInt();
        System.out.print("Enter Power of " + a + " : ");
        int b = sc.nextInt();
        int power = 1;
        for (int i = 1; i <= b; i++) {
            power *= a;
            
        }
        System.out.println(a + " raised to the Power " + b + " is " + power + ".");

    }
    
}
