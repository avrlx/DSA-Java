public class FindSecondLargest {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 8, 7, 3, 9, 7, 3, 6, 8, 3, 10, 23, 11, 14 };
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if( a[i] > max)
                max = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if( a[i] > max2 && a[i] != max)
                max2 = a[i];
        }
        System.out.println("1st Maximum is " + max + ".\n2nd Maximum is " + max2 + ".");
    } 
}
