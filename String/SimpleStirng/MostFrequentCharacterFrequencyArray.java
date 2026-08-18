package String.SimpleStirng;

public class MostFrequentCharacterFrequencyArray {
    static void main(String[] args) {
        String s = "allviralzzzzz";
        char ans = s.charAt(0);
        int i =0;
        int[] freq = new int[26];
        while (i<s.length()){
            char ch = s.charAt(i++);
            int index = ch - 'a';
            freq[index]++;
        }
        int maxf = 0;
        for (int j = 0; j < 26; j++) {
            if(maxf < freq[j]) {
                maxf = freq[j];
                ans = (char)(97 + j);
            }
        }
        System.out.println(ans);

    }


}
