class Solution {
    public String[] solution(String[] names) {
        // 그룹 개수: 5명씩 나누므로 (전체 길이 + 4) / 5
        int groupCount = (names.length + 4) / 5;
        String[] answer = new String[groupCount];
        
        // 각 그룹의 첫 사람만 answer에 저장
        for (int i = 0; i < groupCount; i++) {
            answer[i] = names[i * 5];
        }
        
        return answer;
    }
}
