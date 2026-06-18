
import java.util.ArrayList;



public class Basic {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(10); // 0
        arr.add(93); // 1
        arr.add(67); // 2
        arr.add(56); // 3
        arr.add(29); // 4

        // print complete arraylist..
        System.out.println(arr);

        for( int ele : arr){
            System.out.print(ele + " "); // print for each loop ..
        }
    }
}
