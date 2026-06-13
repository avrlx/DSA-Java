import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int temp = n;
        if (n == 0) n = 9; // if n == 0 the if will make n = (any single digit number) , so that loop run for 1 times and count = 1.
        // b/c 0 is a one digit number.
        int count = 0;
        while(n != 0){
            n /=10;
            count++;
        }
        System.out.println(temp + " is " + count + " digit number.");
    }
    
}
