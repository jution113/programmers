import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> intList = new ArrayList<> ();
        
        for(int i = 0; i < my_string.length(); i++) {
            int num = (int) my_string.charAt(i);
            if(48 <= num && num <= 57) intList.add(num - 48);
        }
        
        int[] answer = intList.stream().sorted().mapToInt(e -> e).toArray();
        
        return answer;
            
    }
}