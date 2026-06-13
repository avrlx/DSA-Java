import java.util.Scanner;

public class DigitOfNuber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(n != 0){
            n /=10;
            count++;
        }
        System.out.println(temp + " is " + count + " digit number.");
    }
    
}
