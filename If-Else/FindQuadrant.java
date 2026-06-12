
import java.util.Scanner;

public class FindQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X co-ordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter Y co-ordinate : ");
        int y = sc.nextInt();
        if(x == 0 && y == 0) System.out.println("(0,0) is origin.");
        else if (x > 0 && y == 0) System.out.println("(" + x + "," + y + ") is in (+ve)X-axis.");
        else if (x < 0 && y == 0) System.out.println("(" + x + "," + y + ") is in (-ve)X-axis.");
        
        else if (x == 0 && y > 0) System.out.println("(" + x + "," + y + ") is in (+ve)Y-axis.");
        else if (x == 0 && y < 0) System.out.println("(" + x + "," + y + ") is in (-ve)Y-axis.");

        else if (x > 0 && y > 0) System.out.println("(" + x + "," + y + ") is in 1st Quadrant.");
        else if (x < 0 && y > 0) System.out.println("(" + x + "," + y + ") is in 2nd Quadrant.");
        else if (x < 0 && y < 0) System.out.println("(" + x + "," + y + ") is in 3rd Quadrant.");
        else if (x > 0 && y < 0) System.out.println("(" + x + "," + y + ") is in 4th Quadrant.");



    }
    
}
