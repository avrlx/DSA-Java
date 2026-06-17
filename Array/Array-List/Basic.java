
import java.util.ArrayList;



public class Basic {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(10); // 0
        arr.add(93); // 1
        arr.add(67); // 2
        arr.add(56); // 3
        arr.add(29); // 4
        System.out.println(arr);
        
        // Update the value..
        arr.set(2,4);
        
        System.out.println(arr.get(1));
        arr.add(2, 30); // insert element in 2nd index..

        // print complete arraylist..
        System.out.println(arr);

        arr.remove(3); //remove at index 3..
        
        System.out.println(arr); // 67 removed

    }
}
