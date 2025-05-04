import java.util.*;

class Solution {
    public int solution(int[] array) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(array);
        // 중앙값
        int answer = array[array.length / 2];
        
        return answer;
    }
}