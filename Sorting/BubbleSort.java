
// Best/Average/Worst Case –> TC = O(n^2)

public class BubbleSort {
    public static void main(String[] args) {
        int[] a  = {1, 3 ,5 ,6, 7, 8,7,3,9,7,3,6,8,3};
        System.out.print("Array before Sorting : ");
        print(a);
        for (int i = 0; i < a.length -1 ; i++) {
            for (int j = 0; j < a.length -1 - i; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print("\nArray after Sorting : ");
        print(a);
    }

    public static void print(int[] a) {
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
