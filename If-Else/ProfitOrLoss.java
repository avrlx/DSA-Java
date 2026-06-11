
import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price : ");
        double sp = sc.nextDouble();
        if(sp ==cp) System.out.println("No Profit and No Loss.");
        else if ( sp>cp) System.out.println(sp-cp + " Profit made.");
        else System.out.println(cp-sp + " Loss incurred.");
    }
    
}
