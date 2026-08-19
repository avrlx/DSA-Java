package TwoDArray;

public class Max {
    static void main(String[] args) {
        int max =Integer.MIN_VALUE;
        int [][] arr = {{1,2,3},{4,5,6},{5,7,9}};
        for (int[] ints : arr) { // to find the length of row
            for (int j = 0; j < arr[0].length; j++) { // to find the length of column
                if( max < ints[j]) max = ints[j];
            }

        }
        System.out.println(max);
    }
}
