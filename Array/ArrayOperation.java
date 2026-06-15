public class ArrayOperation {
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    // Multiply odd index with 2 and add 10 to the even index...
    public static void main(String[] args) {
        int[] a  = {1, 3 ,5 ,6, 7, 8,7,3,9,7,3,6,8,3,};
        print(a);
        for (int i = 0; i < a.length; i++) {
            if(i % 2 == 0)
                a[i] += 10;
            else 
                a[i] *= 2;
        }
        print(a);
    }
    
}
