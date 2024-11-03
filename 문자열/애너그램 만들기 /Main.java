import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String firstStr = sc.next();
        String secondStr = sc.next();
        
        Map<String, Integer> firstMap = new HashMap<String, Integer>();
        Map<String, Integer> secondMap = new HashMap<String, Integer>();
        
        String s = "";
        int sameCharSum = 0;
        
        // firstMap 입력
        for (int i = 0; i < firstStr.length(); i++) {
            s = firstStr.substring(i, i+1);
            
            if (firstMap.containsKey(s)) {
                int count = firstMap.get(s);
                firstMap.replace(s, ++count);
            } else {
                firstMap.put(s, 1);
            }
        }
        
        // secondMap 입력
        for (int i = 0; i < secondStr.length(); i++) {
            s = secondStr.substring(i, i+1);
           
            if (secondMap.containsKey(s)) {
                int count = secondMap.get(s);
                secondMap.replace(s, ++count);
            } else {
                secondMap.put(s, 1);
            }
        }
        
        // 두 문자열에서 공통 단어 갯수 찾기 (애너그램)
        for(String key : firstMap.keySet()) {
            if (secondMap.containsKey(key)) {
                if (firstMap.get(key) > secondMap.get(key)) {
                    sameCharSum += secondMap.get(key);
                } else {
                    sameCharSum += firstMap.get(key);
                }
            }
        }
        
        // 결과값 도출
        int result = firstStr.length() - sameCharSum + secondStr.length() - sameCharSum;
        System.out.println(result);
        
        //System.out.println(sameCharSum);
        //System.out.println(firstMap.keySet());
        //System.out.println(firstMap.values());
        //System.out.println(secondMap.keySet());
        //System.out.println(secondMap.values());
    }
}
