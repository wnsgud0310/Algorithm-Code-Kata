class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            answer += n%10; // 마지막자리 더함
            n = n/10; // 마지막자리 제거
        }
        return answer;
    }
}