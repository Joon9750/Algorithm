class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        switch (ineq + eq) {
            case "<=":
                if (n <= m) answer = 1;
                break;
            case ">=":
                if (n >= m) answer = 1;
                break;
            case ">!":
                if (n > m) answer = 1;
                break;
            case "<!":
                if (n < m) answer = 1;
                break;
        }
        
        return answer;
    }
}
