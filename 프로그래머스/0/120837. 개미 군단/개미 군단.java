class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 공격력이 큰 순으로 사냥감의 체력을 공격력으로 나눠 그 몫을 더해야 최소한의 병력으로 구성이 가능하다
        answer += hp /5 ;
         // 공격력이 5로 가장 큰 장군개미로 사냥감의 체력을 나누고 그 값을 answer에 더한다
        answer += (hp%5)/3;
        // 장군개미로 나눈 나머지 체력을 두번째로 공격력이 큰 병정개미의 공격력으로 나누고 그 값을 answer에 더한다
        answer += ((hp%5)%3)/1;
         // 장군개미로 나눈 나머지 체력을 병정개미로 나눈 나머지를 일개미의 공격력으로 나누고 그 값을 answer에 더한다
        return answer;
    }
}