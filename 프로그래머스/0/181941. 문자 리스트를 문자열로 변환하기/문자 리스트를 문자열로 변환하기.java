class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];  // 문자열을 하나씩 이어붙임
        }
        return answer;
    }
}
