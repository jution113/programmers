import java.util.*;

class Solution {
    public int solution(int n) {
        double answer = 0;
        
        // 이 문제의 핵심은 근본 없이 피자를 일곱 조각으로 잘라준다는 것이다.
        final double pizzaSize = 7;
        
        answer = Math.ceil(n / pizzaSize);
        
        return (int) answer;
    }
}