
import java.util.Scanner;

public class ParameterAndArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle : ");
        double l = sc.nextDouble();
        System.out.print("Enter length of Breadth : ");
        double b = sc.nextDouble();
        double area = l * b;
        double parameter = 2 * (l + b);
        if(area == parameter) System.out.println("Area : " + area + "\n" + "Parameter : " + parameter + "\n" + "Area is equal to Parameter.");
        else if (area > parameter) System.out.println("Area : " + area + "\n" + "Parameter : " + parameter + "\n" + "Area is greater than Parameter.");
        else if (area < parameter) System.out.println("Area : " + area + "\n" + "Parameter : " + parameter + "\n" + "Parameter is greater than Area.");


    }
    
}
