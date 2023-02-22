class Solution {
    public int solution(int hp) {
        int answer = 0;
        final int eliteAntATK = 5;
        final int soldierAntATK = 3;
        final int antATK = 1;
        
        if(hp >= eliteAntATK) {
            answer += hp / eliteAntATK;
            hp %= eliteAntATK;
        }
        
        if(hp >= soldierAntATK) {
            answer += hp / soldierAntATK;
            hp %= soldierAntATK;
        }
        
        answer += hp;
        
        return answer;
    }
}