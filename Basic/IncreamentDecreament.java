
import java.util.Scanner;

public class IncreamentDecreament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element : ");
        int a = sc.nextInt();
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        sc.close();
    }
}
