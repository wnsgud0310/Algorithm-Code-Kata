class Solution {
    public int solution(int[] num_list) {
        for(int i = 0; i <num_list.length; i++){
            if(num_list[i]<0){
                return i;
            }
        }
        return -1;
    }
}
// 1. for 반복문을 사용해서 num_list 배열을 처음부터 끝까지 탐색
// 2. 각 원소가 음수(<0)인지 검사
// 3. 처음으로 음수를 만나면 그 인덱스를 바로 return