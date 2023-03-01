class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = String.valueOf(order);
        
        for(int i = 0; i < strOrder.length(); i++) {
            int num = Character.getNumericValue(strOrder.charAt(i));
            if(num > 0 && num % 3 == 0) answer++;
        }
        
        return answer;
    }
}