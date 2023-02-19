class Solution {
    public int solution(int n) {
        // 1. 모두 동일한 조각을 먹을 때 한사람이 몇 조각의 피자를 먹어야 하는지 구한다.
        // 2. 전체 조각을 판(6조각)으로 치환한다.
        
        int answer = 0;
        final int pizzaSize = 6;
        
        //  최대 공약수 구하기 -> 한 사람이 먹게 될 피자 조각 수
        int pizzaSlicePerPerson = gcd(n, pizzaSize);
        
        // n과 6의 최소 공배수 구하기 -> 전체 피자 조각 수
        int totalPizzaSlice = lcm(n, pizzaSize, pizzaSlicePerPerson);
        
        answer = totalPizzaSlice / pizzaSize;
        
        return answer;
    }
    
    private int gcd(int num1, int num2) {
        if(num1 % num2 == 0) return num2;
        return gcd(num2, num1 % num2);
    }
    
    private int lcm(int num1, int num2, int gcd) {
        return (num1 * num2) / gcd;
    }
}