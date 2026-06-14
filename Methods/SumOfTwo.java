
import java.util.Scanner;


public class SumOfTwo {
    public static void sum(int a ,int b){
        System.out.println("Sum of " + a + " and " + b + " = " + (a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        sum(n,m);
    }
}
