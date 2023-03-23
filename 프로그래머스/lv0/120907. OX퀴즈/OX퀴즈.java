class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String[] expression = quiz[i].split(" ");
            int num1 = Integer.valueOf(expression[0]);
            String operator = expression[1];
            int num2 = Integer.valueOf(expression[2]);
            int num3 = Integer.valueOf(expression[4]);
            
            if(operator.equals("+")) {
                answer[i] = num1 + num2 == num3 ? "O" : "X";
            } else {
                answer[i] = num1 - num2 == num3 ? "O" : "X";
            }
        }
        
        return answer;
    }
}