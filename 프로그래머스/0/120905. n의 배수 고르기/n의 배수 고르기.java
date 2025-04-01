class Solution {
    public int[] solution(int n, int[] numlist) {
        int num = 0; // n의 배수 구한 길이
        int idx = 0; // answer의 인덱스
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0)
            num++;
        }
        
        int[] answer = new int[num];
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[idx] = numlist[i];
                idx++;
            }
        }
        
        return answer;
    }
}