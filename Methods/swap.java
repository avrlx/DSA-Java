import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap : "+ a + " " + b); 
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap : "+ a + " " + b); 

    }
}
