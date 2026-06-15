import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" element : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE ;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println("Minimum element of Array : " + min);
    }
    
}
