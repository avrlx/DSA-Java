package TwoDArray;

public class Sum {
    static void main(String[] args) {
        int sum =0;
        int [][] arr = {{1,2,3},{4,5,6},{5,7,9}};
        for (int[] ints : arr) { // to find the length of row
            for (int j = 0; j < arr[0].length; j++) { // to find the length of column
                sum += ints[j];
            }

        }
        System.out.println(sum);
    }
}
