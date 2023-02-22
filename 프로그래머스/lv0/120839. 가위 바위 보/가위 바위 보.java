class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int rspIndex = 0; rspIndex < rsp.length(); rspIndex++) {
            String action = String.valueOf(rsp.charAt(rspIndex));
            if(action.equals("0")) {
                answer += 5;
            } else if(action.equals("2")) {
                answer += 0;
            } else {
                answer += 2;
            }
        }
        
        return answer;
    }
}