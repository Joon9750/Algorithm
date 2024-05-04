import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // 1. 큐 생성, ()로 완료된 문자는 큐에서 제거
        Queue q = new LinkedList();
        
        // 2. String의 Char 큐에 넣으며, 조건문 실행
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // System.out.println(i +"번째" + q.size());
            if (q.isEmpty()) {
                // 큐의 첫 요소로 ")"가 들어온 경우 - 무조건 false
                if (c == ')') {
                    answer = false;
                    return answer;
                }
                // 큐의 첫 요소로 "("가 들어온 경우
                q.offer(c);
            } else {
                // 큐에 "()"로 들어간 경우 - 가장 처음 들어온 "("와 ")" 삭제
                if (c == ')') {
                    q.poll();
                    // 시간 초과의 원인!
                    // q.remove(')');
                } else {
                    // 큐에 "("가 들어온 경우 - 큐에 저장
                    q.offer(c);
                }
            }
        }
        
        // 3. 마지막에 큐가 비어있지 않으면 false
        if (q.isEmpty()) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
