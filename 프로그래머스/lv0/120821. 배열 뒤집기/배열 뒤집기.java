class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int index = 0; index < num_list.length; index++) {
            answer[index] = num_list[num_list.length - 1 - index];
        }
        
        return answer;
    }
}