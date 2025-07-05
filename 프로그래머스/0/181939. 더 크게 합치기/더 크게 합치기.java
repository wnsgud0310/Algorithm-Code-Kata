class Solution {
    public int solution(int a, int b) {
        // 정수 a와 b를 문자열로 변환해서 이어 붙임
        // 예: a = 9, b = 91 이면 → "991"
        // "" + a + b 는 문자열 연결을 의미함
        String abStr = "" + a + b; // a ⊕ b
        String baStr = "" + b + a; // b ⊕ a

        // 문자열로 연결된 값을 정수형으로 변환
        int ab = Integer.parseInt(abStr); // "991" → 991
        int ba = Integer.parseInt(baStr); // "919" → 919

        // 두 숫자를 비교해서 더 큰 값을 반환
        // 같은 경우에도 ab 를 반환하므로 Math.max(ab, ba)로 처리 가능
        return Math.max(ab, ba);
    }
}
