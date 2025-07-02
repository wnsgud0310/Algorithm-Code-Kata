class Solution {
    public String solution(String str1, String str2) {
      StringBuilder answer = new StringBuilder(); //성능을 위해 StringBuilder 사용
        
        for(int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i)); // str1의 i번째 문자
            answer.append(str2.charAt(i)); // str2의 i번쨰 문자
        }
        
        return answer.toString();
    }
}