public class PrintMethod {
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a  = {1, 3 ,5 ,6, 7, 8};
        print(a);
    }
    
}
