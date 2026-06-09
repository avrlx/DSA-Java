
import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st element : ");
        int a = s.nextInt();
        System.out.print("Enter 2nd element : ");
        int b = s.nextInt();
        int c = a + b;
        System.out.print("Sum of "+a+" and "+b+" "+"is : "+c);
    }
    
}
