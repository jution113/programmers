class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int numbersLength = numbers.length;
        final int indexIncrease = 2;
        
        answer = numbers[indexIncrease * (k - 1) % numbersLength];
        
        return answer;
    }
}

