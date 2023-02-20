class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int evenNumCount = 0;
        int oddNumCount = 0;
        
        for(int num : num_list) {
            if(num % 2 == 0) {
                evenNumCount++;
            } else {
                oddNumCount++;
            }
        }
        
        answer[0] = evenNumCount;
        answer[1] = oddNumCount;
        return answer;
    }
}