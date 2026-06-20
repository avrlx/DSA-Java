public class InsertionSorting {
    public static void main(String[] args) {
        int[] a  = {1,0, 3 ,5,0 ,6, 7,0, 8,7,3,0,9,7,0,3,6,8,3};
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while(j > 0 && a[j]<a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;                
            }
        }
        print(a);
    }
    public static void print(int[] a) {
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
}
