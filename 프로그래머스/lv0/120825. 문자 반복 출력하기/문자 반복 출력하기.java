class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int stringIndex = 0; stringIndex < my_string.length(); stringIndex++) {
            for(int repeatCount = 0; repeatCount < n; repeatCount++) {
                answer += String.valueOf(my_string.charAt(stringIndex));
            }
        }
        
        return answer;
    }
}