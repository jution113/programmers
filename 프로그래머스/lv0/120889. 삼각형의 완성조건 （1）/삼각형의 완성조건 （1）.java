class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int sum = 0;
        
        for(int side : sides) {
            max = side > max ? side : max;
            sum += side;
        }
        
        answer = sum - max > max ? 1 : 2;
        
        return answer;
    }
}