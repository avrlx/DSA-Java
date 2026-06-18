
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList <Integer> arr = new ArrayList<>();
        System.out.println("After adding one to the number : ");
        int c = 1;
        for (int i = a.length - 1; i >=0 ; i--) {
            if(a[i] + c <= 9) {
                arr.add(a[i] + c);
                c = 0;
            }
            else {
                arr.add(0);
                c = 1;
            }
            
        }

        if ( c==1) arr.add(1);
        Collections.reverse(arr);
        System.out.print(arr);
    }
    
}