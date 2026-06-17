import java.util.Scanner;

public class PrintProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" element : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int pro = 1 ;
        for (int i = 0; i < arr.length; i++) {
            pro *= arr[i];
        }
        System.out.println("Product of elements of Array : " + pro);
    }
}
