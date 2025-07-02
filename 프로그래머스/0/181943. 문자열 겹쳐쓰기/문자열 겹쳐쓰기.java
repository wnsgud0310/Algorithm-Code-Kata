class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        //1. 덮어쓰기 전까지 기존 문자열 복사
        for(int i = 0; i< s; i++){
            answer += my_string.charAt(i);
        }
        
        //2. 덮어쓰기 문자열 추가
        int j = 0;
        while (j<overwrite_string.length()){
            answer += overwrite_string.charAt(j);
            j++;
        }
        
        //3. 덮어쓴 이후 원래 문자열의 나머지 이어붙이기
        int k = j + s;
        while(k < my_string.length()){
            answer += my_string.charAt(k);
            k++;
        }
        
        return answer;
    }
}