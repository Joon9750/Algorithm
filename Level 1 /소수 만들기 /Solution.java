import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] arr = new int[100000];
        int index = 0;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    arr[index++] = (nums[i] + nums[j] + nums[k]);
                }
            }
        }
    
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                ++answer;
            }
        }
        
        return answer;
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
