class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        
        // n부터 num_list까지 일단 우선 배열 저장
        for(int i = 0; i<num_list.length-n; i++){
            answer[i] = num_list[n+i];
        }
        
        //  0부터 n까지 뒤에다 저장 
        for(int i = num_list.length-n; i<num_list.length; i++){
            answer[i] = num_list[idx++];
        }
        return answer;
    }
}