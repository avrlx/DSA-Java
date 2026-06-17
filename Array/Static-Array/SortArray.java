
import java.util.Arrays;

public class SortArray {
     public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a  = {1, -3 ,55 ,6, -7, -8};
        System.out.println("Unsorted Array : ");
        print(a);
        Arrays.sort(a);
        System.out.println("Sorted Array : ");
        print(a);
    }
    
}
