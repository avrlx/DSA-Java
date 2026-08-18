package String.SimpleStirng;

public class MostFequentCharacter {
    static void main(String[] args) {
        String s = "aviralsingh";
        char ans = s.charAt(0);
        int maxf = 1;
        for (int i = 0; i < s.length(); i++) {
            int c = 1;
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) c++;
            }
            
            if(c>maxf) {
                maxf = c ;
                ans = s.charAt(i);
            }
            else if (c == maxf && s.charAt(i) <ans) ans = s.charAt(i);
        }
        System.out.println(ans);
    }
}
