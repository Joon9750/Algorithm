class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int aResult;
        int bResult;
        
        // a, b 경우
        aResult = tenTimes(a, numSize(b)) + b;
        
        // b, a 경우
        bResult = tenTimes(b, numSize(a)) + a;
        
        if (aResult < bResult) {
            answer = bResult;
        } else {
            answer = aResult;
        }
        
        return answer;
    }
    
    // 자릿수 구하기
    public static int numSize(int num) {
        int numSize = 1;
        
        if (num < 10) {
            numSize = 1;
        } else {
            while (num >= 10) {
                num = num / 10;
                numSize += 1;
            }
        }
        
        return numSize;
    }
    
    // 첫 숫자에 자릿수 곱하기
    public static int tenTimes(int num, int numSize) {
        for (int i = 0; i < numSize; i++) {
            num *= 10;
        }
        
        return num;
    }
}
