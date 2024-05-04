import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int stringSize = a.length();
        String answer = "";
        for (int i = 0; i < stringSize; i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        
        // 결과
        System.out.println(answer);
    }
}
