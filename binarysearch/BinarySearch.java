import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        int[] a  = {1, 3 ,5 ,6, 7, 8};
        Scanner sc = new Scanner(System.in); //learn it
        int k = sc.nextInt();
        int n = binaryserch(a,k);
        if (n!=-1) System.out.println("Element found at index " + n);
        else System.out.println("Element not found");
    }
    public static int binaryserch(int[] a , int k){
        int n = a.length;
        int low = 0;
        int high = n - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if (a[mid ] == k) return mid;
            else if (a[mid] < k) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
