public class Typecasting_IntToChar {
    public static void main(String[] args) {
  
        // Implicit typecasting is not allowed from integer to character.
        int x = 65;
        System.out.println(x + " -> " + (char)x);
        x = 97;
        System.out.println(x + " -> " + (char)x);
        x = 48;
        System.out.println(x + " -> " + (char)x);
        x = 32;
        System.out.println(x + " -> " + (char)x + " (Space)");

    }
    
}
