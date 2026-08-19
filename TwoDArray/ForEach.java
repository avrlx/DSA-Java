package TwoDArray;

public class ForEach {
    static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for( int [] a : arr){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }
}
