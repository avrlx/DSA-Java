public class SelctionSortDecending {
    public static void main(String[] args) {
        int[] a  = {1,0, 3 ,5,0 ,6, 7,0, 8,7,3,0,9,7,0,3,6,8,3};
        for (int i = 0; i < a.length -1; i++) {
            int max = Integer.MIN_VALUE;
            int maxdex = i;
            for (int j = i; j < a.length; j++) {
                if(a[j] > max){
                    max = a[j];
                    maxdex = j;
                }
            }
            a[maxdex] = a[i];
            a[i] = max;
            
        }
        print(a);
    }

    public static void print(int[] a) {
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
