import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(chArr);
        
        answer = new String(chArr);
        return answer;
    }
}