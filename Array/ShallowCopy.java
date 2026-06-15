public class ShallowCopy {
    public static void main(String[] args) {
        int[] a  = {1, 3 ,5 ,6, 7, 8};
        int[] x = a; // x is a shollow copy of 'a' means change in x refect in 'a'. Like Methods... 
        System.out.println(a[2]);
        x[ 2] = -23;
        System.out.println(a[2]);
    }
    
}
