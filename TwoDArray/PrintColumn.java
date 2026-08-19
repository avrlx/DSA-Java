package TwoDArray;

public class PrintColumn {
    static void main(String[] args) {

        int [][] arr = {{1,2,3},{4,5,6},{5,7,9}};
        for (int j = 0; j < arr[0].length; j++) { // to find the length of row
            for (int i = 0; i < arr.length ; i++) { // to find the length of column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
