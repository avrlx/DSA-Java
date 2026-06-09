
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Principle value : ");
        double p = s.nextDouble();
        System.out.print("Enter Rate in % : ");
        double r = s.nextDouble();

        System.out.print("Enter Time in Years : ");
        double t = s.nextDouble();
        double SI = p*r*t/100;
        System.out.println("The Simple Interest is ; "+ SI);
    }
    
}
