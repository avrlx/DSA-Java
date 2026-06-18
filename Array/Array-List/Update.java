import java.util.ArrayList;

public class Update {
    public static void main(String[] args) {
        ArrayList var1 = new ArrayList();
        var1.add(10);
        var1.add(93);
        var1.add(67);
        var1.add(56);
        var1.add(29);
        System.out.println(var1); 
        // Update the value..
        var1.set(2,4); // change index 2 to 4..
        System.out.println(var1); 
    }
}
