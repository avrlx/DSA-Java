
import java.util.Scanner;

public class SearchInArray {
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a  = {1, 3 ,5 ,6, 7, 8,7,3,9,7,3,6,8,3,};
        System.out.print("Enter element to search : ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == k){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("Element exists in array.");
        else System.out.println("Element not exists in array.");

    }
}
