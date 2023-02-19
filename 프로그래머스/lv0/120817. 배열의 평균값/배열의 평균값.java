class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        float numbersSum = 0;
        for(int number : numbers) {
            numbersSum += number;
        }
        
        answer = numbersSum / numbers.length;
        
        return answer;
    }
}