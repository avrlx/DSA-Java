import java.util.Scanner;

public class PrintNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" element : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element are : ");
        for (int i = 0; i < arr.length; i++) {
             if(arr[i] < 0){
            System.out.print(arr[i] + " ");
             }
        }
    }
}
