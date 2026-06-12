public class PrintASCIIValue {
    public static void main(String[] args) {
        System.out.println("ASCII value A - Z");
        for (int i = 65; i <= 90; i++) {
            System.out.println((char)i + " -> " + i);
            
        }
        System.out.println("ASCII value a - z ");
        for (int i = 97; i <= 122; i++) {
            System.out.println((char)i + " -> " + i);
            
        }
    }
    
}
