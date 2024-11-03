import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        int s1Second = convertToSecond(s1);
        int s2Second = convertToSecond(s2);
        
        if (s1Second == s2Second) {
            System.out.println("24:00:00");
            sc.close();
            return;
        }
        
        int dayToSecond = 86400;
        int interval = 0;
        
        if (s1Second > s2Second) {
            interval = dayToSecond - s1Second + s2Second;
        } else {
            interval = s2Second - s1Second;
        }
        
        String result = convertSecondToString(interval);
        System.out.println(result);
        
        sc.close();
    }
    
    public static int convertToSecond(String s) {
        String[] timeArray = s.split(":");
        
        int hour = Integer.parseInt(timeArray[0]);
        int min = Integer.parseInt(timeArray[1]);
        int second = Integer.parseInt(timeArray[2]);
        
        int totalSecond = (hour * 3600) + (min * 60) + second;
        
        return totalSecond;
    }
    
    public static String convertSecondToString(int totalSecond) {
        int hour = totalSecond / 3600;
        totalSecond -= (hour * 3600);
        String hourToString = hour > 9 ? Integer.toString(hour) : "0" + Integer.toString(hour);
        
        int min = totalSecond / 60;
        totalSecond -= (min * 60);
        String minToString = min > 9 ? Integer.toString(min) : "0" + Integer.toString(min);
        
        int second = totalSecond;
        String secondToString = second > 9 ? Integer.toString(second) : "0" + Integer.toString(second);
        
        String totalSecondToString = hourToString + ":" + minToString + ":" + secondToString;
        
        return totalSecondToString;
    }
}
