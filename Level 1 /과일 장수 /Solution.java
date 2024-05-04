import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 1. 내림차순 정렬
        int[] arr = reverseSort(score);
        
        // 2. m 만큼 묶기
        int[] boxValueArr = new int[1000000];
        int boxIndex = 0;
        int boxValue = 0;
        int appleCount = 1;
        for (int i = 0; i < arr.length; i++) {
            if (appleCount < m) {
                ++appleCount;
            } else if (appleCount == m) {
                appleCount = 1;
                boxValue = arr[i] * m;
                boxValueArr[boxIndex++] = boxValue;
            }
        }
        
        // 3. 각 박스 이익 합산
        int sum = 0;
        for (int i = 0; i < boxValueArr.length; i++) {
            sum += boxValueArr[i];
        }
        answer = sum;
        
        return answer;
    }
    
    // 내림차순 함수
    public static int[] reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
