import java.util.ArrayList;

public class get {
    public static void main(String[] args) {
         ArrayList <Integer> arr = new ArrayList<>();
        arr.add(10); // 0
        arr.add(93); // 1
        arr.add(67); // 2
        arr.add(56); // 3
        arr.add(29); // 4

        System.out.println(arr);

        //print an element at index 1..
        System.out.println(arr.get(1));

    }
    
}
