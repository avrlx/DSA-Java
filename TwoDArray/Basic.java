package TwoDArray;

public class Basic {
    static void main(String[] args) {

        int [][] arr = new int[4][4];
        for (int i = 0; i < arr.length ; i++) { // to find the length of row
            for (int j = 0; j < arr[0].length; j++) { // to find the length of column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
