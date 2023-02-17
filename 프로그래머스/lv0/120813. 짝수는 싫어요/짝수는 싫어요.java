class Solution {
    public int[] solution(int n) {
        int lastNumberOddCount = n % 2 == 0 ? 0 : 1;
        int totalOddCount = n / 2 + lastNumberOddCount;
        int[] answer = new int[totalOddCount];
        int answerIndex = 0;
        
        for(int number = 1; number <= n; number++) {
            if(number % 2 != 0) {
                answer[answerIndex] = number;
                answerIndex++;
            }
        }
        
        return answer;
    }
}