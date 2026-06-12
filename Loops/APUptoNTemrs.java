import java.util.Scanner;

public class APUptoNTemrs{
    public static void main(String[] args) {
        int k=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term : ");
        int n = sc.nextInt();
        System.out.println("AP form 1 to " + n + " with comman diff of 3");
        for (int i = 1; i < n; i += 3) {
            System.out.println(k++ + " term - " + i);
            
        }
    }
}