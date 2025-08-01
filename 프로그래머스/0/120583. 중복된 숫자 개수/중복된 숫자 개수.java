class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]==n){
                answer ++;
            }
        }
        // array 안에 n이 있으면 answer +1
            
        return answer;
    }
}