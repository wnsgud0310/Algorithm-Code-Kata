// 인덱스에 따른 조건 처리
// mode 는 0또는 1, 처음시작은 mode = 0
// mode가 0이면 짝수 인덱스에만 문자를 추가
// mode가 1이면 홀수 인덱스에만 문자를 ㅊ가
// code[i] != "1"일 때만 ret에 추가가능

class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder(); // 문자열 누적을 위함
        int mode = 0;
        
        for(int i = 0; i <code.length(); i++){
            char c = code.charAt(i);
            
            if(c =='1'){
                // mode 전환
                mode = 1-mode; // 0<->1 토글 기법 
            }else{
                if(mode == 0 && i %2 ==0){
                    ret.append(c);
                }else if(mode ==1 && i%2 ==1){
                    ret.append(c);
                }
            }
        }
        
        
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}