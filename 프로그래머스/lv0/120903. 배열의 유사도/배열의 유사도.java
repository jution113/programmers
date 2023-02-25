class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String s1Element : s1) {
            for(String s2Element : s2) {
                if(s1Element.equals(s2Element)) answer++;
            }
        }
        
        return answer;
    }
}