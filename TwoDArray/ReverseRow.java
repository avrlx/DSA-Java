package TwoDArray;

public class ReverseRow {
    static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            int low =0 ;
            int high = arr[0].length - 1 ;
            while (low<high){
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
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

