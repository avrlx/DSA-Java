
import java.util.Scanner;

public class AbsoluteValue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        double n = sc.nextDouble();
        if(n<0){
            double a = n * -1;
            System.out.println("The absolute value of " + n + " is " + a);
        }
        else System.out.println("The absolute value of " + n + " is " + n);

    }
    
}
