package TwoDArray;

public class RowWithMaxSum {
    static void main(String[] args) {
        int max =Integer.MIN_VALUE;
        int sum = 0;
        int [][] arr = {{1,2,3},{4,5,6},{5,7,9}};
        for (int i = 0 ;i<arr.length;i++) { // to find the length of row
            sum = 0;
            for (int j = 0; j < arr[0].length; j++) { // to find the length of column
                sum += arr[i][j];
            }
            if( max < sum) max = sum;
        }
        System.out.println(max);
    }
}
