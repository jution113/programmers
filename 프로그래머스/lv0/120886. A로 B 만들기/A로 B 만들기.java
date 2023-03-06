class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        for(int i = 0; i < before.length(); i++) {
            String ch = String.valueOf(before.charAt(i));
            after = after.replaceFirst(ch, "");
        }
        
        answer = after.equals("") ? 1 : 0;
        
        return answer;
    }
}