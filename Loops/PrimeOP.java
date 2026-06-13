import java.util.Scanner;

public class PrimeOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                flag = true;
                break;
            }
            
        }
        if(flag) System.out.println(n + " is not Prime Number.");
        else System.out.println(n + " is Prime Number.");
    }
    
}
