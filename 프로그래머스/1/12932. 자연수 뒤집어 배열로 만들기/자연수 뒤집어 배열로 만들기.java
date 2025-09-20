class Solution {
    public int[] solution(long n) {
        
        // Long 값을 문자열로 변환 
        String s = Long.toString(n);
        
        // 문자열 뒤집기 
        String rs = new StringBuilder(s).reverse().toString();
        
        // 3) 뒤집힌 문자열 길이만큼 int 배열 준비
        int[] answer = new int[rs.length()];
        
        // 4) 각 문자(char)를 숫자(int)로 변환해 배열에 채운다
        //    문자를 숫자로 바꾸는 표준 트릭: '0'을 빼면 실제 정수값이 된다
        for(int i = 0; i<rs.length(); i++){
            answer[i] = rs.charAt(i) - '0';
        }
          
            
        return answer;
    }
}