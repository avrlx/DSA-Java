
import java.util.Scanner;


public class MaxOfThreef {
    public static int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Max of " + a + " , " + b + " and " + c + " is " + max(a,b,c));


    }
}
