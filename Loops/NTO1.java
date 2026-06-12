
import java.util.Scanner;

public class NTO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        System.out.println("From " + n + " to 1:");
        for (int i = n; i >=1; i--) {
            System.out.print(i + " ");
            
        }
    }
    
}
