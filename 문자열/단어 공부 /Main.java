import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            Character subChar = new Character(s.charAt(i));
            if (Character.isLowerCase(subChar)) {
                subChar = Character.toUpperCase(subChar);
            }
            
            if (hashMap.containsKey(subChar)) {
                int value = hashMap.get(subChar);
                hashMap.replace(subChar, ++value);
            } else {
                hashMap.put(subChar, 1);
            }
        }
        
        int maxInt = 0;
        Character maxCharacter = new Character('a');
        Boolean isMaxIntMany = false;
        
        // System.out.println(hashMap.keySet());
        // System.out.println(hashMap.values());
        
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            // System.out.println(entry);
            if (entry.getValue() > maxInt) {
                maxInt = entry.getValue();
                maxCharacter = entry.getKey();
                isMaxIntMany = false;
            } else if (entry.getValue() == maxInt) {
                isMaxIntMany = true;
            }
        }
        
        if (isMaxIntMany == true) {
            System.out.println("?");
        } else {
            System.out.println(maxCharacter);
        }
    }
}
