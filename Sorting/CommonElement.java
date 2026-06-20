
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] a  = {1,0,0 ,6, 7,0, 8,7,3,0,9,7,0,3,6,8,3};
        int[] b  = { 3 ,5,0 ,6, 7,0, 8,7,9,7,0,3,6,3};
        Arrays.sort(a);
        Arrays.sort(b); 
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0 ,j = 0;
        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                if (arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
                    arr.add(a[i]);
                }
                    j++;
                    i++;
            }
            else if(a[i] < b[j]) i++;
            else j++;
        }
        System.out.println(arr);
    }
    
}
