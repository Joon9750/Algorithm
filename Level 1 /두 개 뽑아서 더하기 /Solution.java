import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        // 1. 오름차순 정렬
        Arrays.sort(numbers);
        
        // 2. 배열 순회 돌면서 두 수 덧셈, 결과 answer 배열에 저장
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                // 동적으로 배열에 요소 추가
                // 새로운 요소 추가를 위해 길이를 1 늘린 새 배열 생성
                answer = Arrays.copyOf(answer, answer.length + 1);
                // 새로운 요소 추가
                answer[answer.length - 1] = sum;
            }
        }
        
        // 3. 배열의 중복 제거 - stream distinct 함수 사용
        Arrays.sort(answer);
        answer = Arrays.stream(answer).distinct().toArray();

        return answer;
    }
}
