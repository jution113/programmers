class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int idx = i; idx <= j; idx++) {
            String str = String.valueOf(idx);
            answer += str.length() - (str.replaceAll(String.valueOf(k), "").length());
        }
        
        return answer;
    }
}