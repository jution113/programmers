class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int answerIndex = 0;
        
        for(int numbersIndex = num1; numbersIndex <= num2; numbersIndex++) {
            answer[answerIndex] = numbers[numbersIndex];
            answerIndex++;
        }
        
        return answer;
    }
}