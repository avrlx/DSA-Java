
import java.util.Scanner;

public class SquareOfTheNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = s.nextInt();
        int square = n*n;
        System.out.println("Square of the given number "+n+" is: "+square);
    }
    
}
