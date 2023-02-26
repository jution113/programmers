class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            int num = Character.getNumericValue(my_string.charAt(i));
            answer += 0 <= num && num <= 9 ? num : 0;
        }
        
        return answer;
    }
}