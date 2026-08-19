package TwoDArray;

public class MinOfAllMaxOfRow {
    static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int [][] arr = {{1,2,3},{4,5,6},{5,7,9}};
        for (int i = 0 ;i<arr.length;i++) { // to find the length of row
            int max =Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) { // to find the length of column
                if( max < arr[i][j]) max = arr[i][j];
            }
            if( max < min)  min =max;
        }
        System.out.println(min);
    }
}
