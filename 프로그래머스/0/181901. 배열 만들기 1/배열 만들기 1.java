import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int i =1; i<=n; i++){
            if(i % k == 0){
                list.add(i); // k의 배수이면 리스트에 추가
            }
        }
        
        //리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        

        return answer;
    }
}