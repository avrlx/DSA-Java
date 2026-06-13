
import java.util.Scanner;


public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int column = sc.nextInt();

        System.out.println("The Star Rectangle :");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
