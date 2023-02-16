class Solution {
    public int[] solution(int[] numbers) {
        int numbersLength = numbers.length;
        int[] answer = numbers;
        
        for(int i = 0; i < numbersLength; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}