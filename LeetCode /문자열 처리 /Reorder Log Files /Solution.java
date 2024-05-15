import java.util.Arrays;

class Solution {
    public String[] reorderLogFiles(String[] logs) {

        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        for (String log: logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digitList.add(log);
            } else {
                letterList.add(log);
            }
        }

        letterList.sort((s1, s2) -> {
            
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);

            // 문자를 사전순 비교
            int compared = s1x[1].compareTo(s2x[1]);
            // 문자가 동일한 경우 식별자 비교
            if (compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                return compared;
            }
        });

        letterList.addAll(digitList);

        return letterList.toArray(new String[0]);
    }
}
