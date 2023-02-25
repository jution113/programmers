class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = String.valueOf(n);
        int length = strN.length();
        
        for(int i = 0; i < length; i++) {
            answer += Character.getNumericValue(strN.charAt(i));
        }
        
        return answer;
    }
}