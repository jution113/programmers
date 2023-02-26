import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        double sqrt = Math.sqrt(n);
        double sqrtToInt = (int) Math.sqrt(n);
        answer = sqrt == sqrtToInt ? 1 : 2;
        
        return answer;
    }
}