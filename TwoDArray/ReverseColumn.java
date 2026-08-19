package TwoDArray;

public class ReverseColumn {
    static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int j = 0; j < arr[0].length; j++) {
            int low =0 ;
            int high = arr.length - 1 ;
            while (low<high){
                int temp = arr[low][j];
                arr[low][j] = arr[high][j];
                arr[high][j] = temp;
                low ++;
                high--;
            }
        }
        for(int[] a : arr){
            for(int b :a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
