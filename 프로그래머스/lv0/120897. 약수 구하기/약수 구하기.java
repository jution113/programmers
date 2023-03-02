import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrList = new ArrayList<> ();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) arrList.add(i);
        }
        int[] answer = arrList.stream().mapToInt(e-> e).toArray();
        return answer;
    }
}