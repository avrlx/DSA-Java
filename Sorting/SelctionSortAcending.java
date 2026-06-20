public class SelctionSortAcending{
    public static void main(String[] args) {
        int[] a  = {1,0, 3 ,5,0 ,6, 7,0, 8,7,3,0,9,7,0,3,6,8,3};
        
        for (int i = 0; i < a.length -1; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = i;
            for (int j = i; j < a.length; j++) {
                if(a[j] < min){
                    min = a[j];
                    mindex = j;
                }
            }
            a[mindex] = a[i];
            a[i] = min;
            
        }
        print(a);
    }

    public static void print(int[] a) {
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}