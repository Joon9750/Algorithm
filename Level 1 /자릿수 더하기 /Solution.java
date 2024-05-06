import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int numDigit = calculateDigit(n);
   
        for (int i = 0; i < numDigit; i++) {
            answer = answer + (n % 10);
            n = n / 10;
        }
    
        return answer;
    }
    
    public static int calculateDigit(int num) {
        int digit = 1;
        while (num > 9) {
            num = num / 10;
            ++digit;
        }
        
        return digit;
    }
}
