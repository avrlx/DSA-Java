
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner This_is_Scanner$ = new Scanner(System.in);
        System.out.print("Enter Principle value : ");
        double p = This_is_Scanner$.nextDouble();
        System.out.print("Enter Rate in % : ");
        double r = This_is_Scanner$.nextDouble();

        System.out.print("Enter Time in Years : ");
        double t = This_is_Scanner$.nextDouble();
        double SI = p*r*t/100;
        System.out.println("The Simple Interest is ; "+ SI);
    }
    
}
