public class ArrayInMethods {
    public static void main(String[] args) {
        int[] a  = {1, 3 ,5 ,6, 7, 8};
        System.out.println(a[0]);
        change(a);
        System.out.println(a[0]);
    }
    public static void change(int[] y ){
        y[0] = 10;
    }
    
}
