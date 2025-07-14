class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];  // 결과 저장 배열

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];  // 시작 인덱스
            int e = queries[q][1];  // 끝 인덱스
            int k = queries[q][2];  // 비교 기준값

            int min = Integer.MAX_VALUE;  // k보다 큰 값 중 가장 작은 값 저장

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < min) {
                    min = arr[i];
                }
            }

            // min이 갱신되지 않았다면 -1 저장
            answer[q] = (min == Integer.MAX_VALUE) ? -1 : min;
        }

        return answer;
    }
}
