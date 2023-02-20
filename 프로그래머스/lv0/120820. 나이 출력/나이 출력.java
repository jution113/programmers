class Solution {
    public int solution(int age) {
        int answer = 0;
        int startAge = 1;
        final int standardYear = 2022;
        
        
        answer = standardYear - (age - startAge);
        
        return answer;
    }
}