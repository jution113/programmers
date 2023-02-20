class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int index = my_string.length() - 1; index >= 0; index--) {
            answer += my_string.charAt(index);
        }
        
        return answer;
    }
}