class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        final int foodPrice = 12000;
        final int beveragePrice = 2000;
        int serviceBeverageCount = n / 10;
        
        answer = (foodPrice * n) + (beveragePrice * (k - serviceBeverageCount));
        
        return answer;
    }
}