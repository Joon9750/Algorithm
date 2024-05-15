import java.util.*;
import java.util.Map.Entry;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String s: words) {
            if (ban.contains(s)) {
                continue;
            } else {
                String[] mKeys = map.keySet().toArray(new String[map.size()]);
                if (isUniqueWord(s, mKeys)) {
                    map.put(s, 1);
                } else {
                    map.put(s, map.get(s) + 1);
                }
            }
        }

        String maxString = "";
        int maxInt = 0;
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maxInt) {
                maxString = entry.getKey();
                maxInt = entry.getValue();
            }
        }

        return maxString;
    }

    public static boolean isUniqueWord(String s, String[] words) {
        for (String element: words) {
            if (element.equals(s)) {
                return false;
            }
        }
        return true;
    }
}
