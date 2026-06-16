
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
	int[] a = {1, 3, 5, 6, 7, 8, 7, 3, 9, 7, 3, 6, 8, 3 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if( a[i] + a[j] == target){
                    flag = true;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("Pair Exists");
        else
            System.out.println("Pair not Exists");

    }
    
}
