
import java.util.Arrays;

public class Sum2 {
    public static void main(String[] args) {
        int[] a  = {1,0, 3 ,5,0 ,6, 7,0, 8,7,3,0,9,7,0,3,6,8,3};
        int target = 9;
        Arrays.sort(a);
        int i = 0,j = a.length-1;
        boolean flag = false;
        while(i<j){
            if(a[i] + a[j] == target){
                flag = true;
                break;
            }
            else if(a[i] + a[j] > target) j--;
            else if(a[i] + a[j] < target) i++;
      
        }
        if(flag) System.out.println("target Exist");
        else System.out.println("target not exist.");
    }

    public static void print(int[] a) {
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
