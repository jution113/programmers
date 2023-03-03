import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int lastIdx = numbers.length - 1;
        Arrays.sort(numbers);
        int valueA = numbers[0] * numbers[1];
        int valueB = numbers[lastIdx - 1] * numbers[lastIdx];
        answer = valueA > valueB ? valueA : valueB;
        return answer;
    }
}