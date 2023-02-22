import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrtOfN = (int) Math.sqrt((double) n);
        
        for(int num = 1; num <= sqrtOfN; num++) {
            if(n % num == 0) {
                int orderedPair = 2;
                if(Math.pow(num, 2) == n) {
                    orderedPair = 1;
                }
                
                answer += orderedPair;
            }
        }
        
        return answer;
    }
}