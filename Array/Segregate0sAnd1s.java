import java.util.Scanner;

public class Segregate0sAnd1s {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter only zero and one : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int i = 0, j = arr.length-1;
        while(i < j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if(arr[j] == 0 && arr[i] == 1){
                arr[i++] = 0;
                arr[j--] = 1;
                
            }
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + " ");
        }
   } 
}
