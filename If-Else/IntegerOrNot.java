
import java.util.Scanner;

public class IntegerOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x==0) System.out.println(x + " is an Integer.");
        else System.out.println(n + " is not an Integer.");
    }
}