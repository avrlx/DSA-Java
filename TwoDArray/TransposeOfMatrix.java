package TwoDArray;

public class TransposeOfMatrix {
    static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j <i ; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
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
