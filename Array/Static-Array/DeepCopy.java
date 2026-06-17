import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] a  = {1, 3 ,5 ,6, 7, 8};
        int[] x = Arrays.copyOf(a, a.length);
        // It is Deep copy of the array 'a' it means if we change in x , 'a' will not change , 
        // 'x' is new array with same elements..
        System.out.println(a[2]);
        x[2] = -34;
        System.out.println(a[2]);

    }
    
}
