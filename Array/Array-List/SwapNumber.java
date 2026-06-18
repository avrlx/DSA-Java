import java.util.ArrayList;

public class SwapNumber {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(10); // 0
        arr.add(93); // 1
        arr.add(67); // 2
        arr.add(56); // 3
        arr.add(29); // 4
        System.out.println(arr);
        int i = 0 ;
        int j = arr.size() - 1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println("Reversed : " + arr);
    }
    
}
