public class Typecasting_CharToInteger {
    public static void main(String[] args) {

        // Implicit typecasting

        char ch  = 'a';
        System.out.print(ch + " -> ");
        int a = ch;
        System.out.println(a);

        char ch1  = 'A';
        System.out.print(ch1 + " -> ");
        int a1 = ch1;
        System.out.println(a1);

        char ch2  = '0';
        System.out.print(ch2 + " -> ");
        int a2 = ch2;
        System.out.println(a2);

        // Emplicit typecasting
        System.out.println((int)ch + " -> " + ch);
        System.out.println((int)ch1 + " -> " + ch1);
        System.out.println((int)ch2 + " -> " + ch2);

    }
    
}
