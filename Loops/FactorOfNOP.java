import java.util.Scanner;

public class FactorOfNOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Nuber : ");
        int n = sc.nextInt();
        System.out.println("Factors of " + n);
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0 ){
                System.out.print(i + " ");
                if ( i != n/i)
                    System.out.print(n/i + " ");

            }
        }
    }
}
