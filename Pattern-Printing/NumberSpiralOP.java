import java.util.Scanner;

public class NumberSpiralOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any n : ");
        int n = sc.nextInt();
        int a,b;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                a = i;
                b = j;
                if(i > n) a = 2 *n -i;
                if(j > n) b = 2 *n -j;
                System.out.print(Math.min(a,b) + " ");                
            }
            System.out.println();
        }
    }
}
