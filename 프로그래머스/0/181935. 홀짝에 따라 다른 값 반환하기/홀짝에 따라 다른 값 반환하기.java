class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) { // n이 홀수라면
            for (int i = 1; i <= n; i += 2) { // 1부터 n까지 홀수만 더함
                answer += i;
            }
        }else{ // n이 짝수일때
            for(int i =2; i<=n; i+=2){ // 2부터 n까지 제곱의합 
                answer += i*i;
            }
        }
        return answer;
    }
}
