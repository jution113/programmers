class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int arrayElement : array) {
            if(arrayElement == n) answer++;
        }
        return answer;
    }
}