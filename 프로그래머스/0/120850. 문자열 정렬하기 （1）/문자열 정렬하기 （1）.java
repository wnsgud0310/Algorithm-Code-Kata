import java.util.*;                  

class Solution {
    public int[] solution(String my_string) {  
        List<Integer> list = new ArrayList<>();

        // 문자열을 문자 배열로 바꿔서 하나씩 순회
        for (char c : my_string.toCharArray()) {
            // 현재 문자가 숫자인지 판별 ('0'~'9')
            if (Character.isDigit(c)) {
                // 문자 숫자 -> 정수 변환: '3' - '0' == 3
                // (int로 계산된 뒤 Integer로 자동 박싱되어 리스트에 들어감)
                list.add(c - '0');
            }
        }

        // 정답 배열을 리스트 크기만큼 생성 (정확한 크기로 한 번에)
        int[] answer = new int[list.size()];

        // 리스트 -> 배열로 복사 (언박싱: Integer -> int 자동)
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // 오름차순 정렬
        Arrays.sort(answer);

        // 결과 반환
        return answer;
    }
}
