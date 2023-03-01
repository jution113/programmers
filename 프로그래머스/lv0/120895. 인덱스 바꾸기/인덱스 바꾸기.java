class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        char stmp = charArr[num1];
        charArr[num1] = charArr[num2];
        charArr[num2] = stmp;
        answer = String.valueOf(charArr);
        
        return answer;
    }
}