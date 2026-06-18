import java.util.ArrayList;

public class Update {
    public static void main(String[] args) {
         ArrayList <Integer> arr = new ArrayList<>();
        arr.add(10); // 0
        arr.add(93); // 1
        arr.add(67); // 2
        arr.add(56); // 3
        arr.add(29); // 4
        System.out.println(arr); 
        // Update the value..

        arr.set(2,4); // change index 2 to 4..
        
        System.out.println(arr); 
    }
}
