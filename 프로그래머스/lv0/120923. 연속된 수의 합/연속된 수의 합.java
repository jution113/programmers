class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middleNum = total / num;
        int startNum = num % 2 == 0 ? middleNum - (num - 1) / 2 : middleNum - num / 2;
        
        answer[0] = startNum;
        for(int i = 0; i < num; i++) {
            answer[i] = startNum + i;
        }
        
        return answer;
    }
}