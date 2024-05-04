import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int stringSize = a.length();
        for (int i = 0; i < stringSize; i++) {
            System.out.println(a.charAt(i));
        }
    }
}
