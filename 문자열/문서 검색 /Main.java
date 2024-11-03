import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        int result = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if ((i + s2.length()) > s1.length()) {
                break;
            } 
            
            String s1SubString = s1.substring(i, i + s2.length());
            if (s1SubString.equals(s2)) {
                // System.out.println("i = " + i);
                ++result;
                i = i + s2.length() - 1;
            } else {
                continue;
            }
        }
    
        System.out.println(result);
        sc.close();
    }
}
