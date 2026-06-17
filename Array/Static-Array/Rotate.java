
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        int[] arr  = {1, 3 ,5 ,6, 7, 8,7,3,9,7,3,6,8,3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Left rotate number : ");
        int d = sc.nextInt();
         int n = arr.length;
        d = d % n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println("Array after rotating by "+ d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void reverse(int[] arr ,int i ,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}
