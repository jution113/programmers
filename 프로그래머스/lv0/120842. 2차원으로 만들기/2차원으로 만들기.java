class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int numIndex = 0;
        
        for(int oneDemension = 0; oneDemension < num_list.length / n; oneDemension++) {
            for(int twoDemension = 0; twoDemension < n; twoDemension++) {
                answer[oneDemension][twoDemension] = num_list[numIndex];
                numIndex++;
            }
        }
        
        return answer;
    }
}