import java.util.*;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        int container = -1;
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            
            if (container == -1) {
                container = num;
                // 시간 복잡도 비효율적임
                // answer = Arrays.copyOf(answer, answer.length + 1);
                // answer[answer.length - 1] = num;
                list.add(num);
                continue;
            }
        
            if (container != num) {
                container = -1;
                container= num;
                // 배열 대신 ArrayList를 사용해 값을 저장하는게 시간 복잡도 측면에서 효율적
                list.add(num);
            }
        }

        // ArrayList 요소들을 배열로 추춸
        int listSize = list.size();
        answer = new int[listSize];
        int index = 0;
        for (int value: list) {
            answer[index++] = value;
        }
        
        return answer;
    }
}
