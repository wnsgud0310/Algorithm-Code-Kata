class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length-1]; //마지막 원소 
        int secondlast = num_list[num_list.length-2]; // 마지막원소 그전 원소
        
        int add = (last>secondlast) ? (last-secondlast) : last * 2;
        
        int[] answer = new int[num_list.length + 1];
        for(int i = 0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        answer[num_list.length] = add;
        
        return answer ;
        
        
    }
}