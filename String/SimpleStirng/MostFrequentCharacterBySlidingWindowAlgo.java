package String.SimpleStirng;

import java.util.Arrays;

public class MostFrequentCharacterBySlidingWindowAlgo {
    static void main(String[] args) {
        String s = "ddddffffffff";
        int n = s.length();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        int maxf = 0;
        char ans =arr[0];
        while (j < n){
            if(arr[i] == arr[j]) j++;
            else {
                int feq = j-i;
                if (feq > maxf){
                    maxf = feq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int feq = j-i;
        if (feq > maxf) {
            maxf = feq;
            ans = arr[i];
        }
        System.out.println(ans);
    }
}
