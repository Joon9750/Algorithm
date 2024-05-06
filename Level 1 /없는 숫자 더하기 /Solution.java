import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
    
        for (int i = 0; i < 10; i++) {
            answer += i;
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) {
                    answer -= i;
                }
            }
        }
            
        return answer;
    }
}
