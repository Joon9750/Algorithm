class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        for (int i = 0; i < s; i++) {
            answer += my_string.charAt(i);
        }
        
        answer += overwrite_string;
        
        int lastStartIndex = overwrite_string.length() + s; // 9
        int my_stringSize = my_string.length(); // 10
        for (int i = lastStartIndex; i < my_stringSize; i++) {
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}
