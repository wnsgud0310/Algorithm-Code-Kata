class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries가 [0,3]이면 arr[0]과 arr[3] swap 
        for(int[] query : queries){
            int i = query[0];
            int j = query[1];
        
        
        // arr[i] 와 arr[j] 의 값 swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
        
        
        return arr;
    }
}