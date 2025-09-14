class Solution {
    public String solution(int age) {
        String ageStr = String.valueOf(age); // 1. 숫자를 문자열로 변환
        StringBuilder sb = new StringBuilder(); // 2. 결과 문자열 담을 StringBuilder

        for (char ch : ageStr.toCharArray()) { // 3. 각 자리 문자 순회
            int num = ch - '0'; // 4. 문자 → 숫자
            char converted = (char) ('a' + num); // 5. 숫자 → a~j 변환
            sb.append(converted); // 6. 결과에 추가
        }

        return sb.toString(); // 7. 최종 문자열 반환
    }
}
