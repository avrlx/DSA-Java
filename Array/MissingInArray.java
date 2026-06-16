
import java.util.Scanner;
// This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.
public class MissingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements : ");
        long n = sc.nextLong();
        System.out.print("Enter element form 1 to "+(1+n)+" except any one : ");
        int[] arr = new int[(int)n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        n++;
        long sum = n*(n+1)/2;
        long arrsum = 0;
        for(int ele : arr)
            arrsum += ele;
        System.out.println("Missing element is " + (sum - arrsum));
        
    }
    
}
