class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);
        
        for(int i = 0; i < strNum.length(); i++ ) {
            char ch = strNum.charAt(i);
            if(Character.getNumericValue(ch) == k) return i + 1;
        }
        
        return -1;
    }
}