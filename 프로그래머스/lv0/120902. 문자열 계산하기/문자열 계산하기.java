class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        int operator = 1;
        
        for(int i = 0; i < strArr.length; i++) {
            String value = strArr[i];
            if(value.equals("+")) {
                operator = 1;
            } else if(value.equals("-")) {
                operator = -1;
            } else {
                answer += operator * Integer.valueOf(value);
            }
        }
        return answer;
    }
}