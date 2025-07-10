class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiple = 1;
        
        for(int i = 0; i<num_list.length; i++){
            sum += num_list[i];
        }
        for(int j = 0; j<num_list.length; j++){
            multiple *= num_list[j];
        }
        
        if(multiple<(sum*sum)){
            return 1;
        }else{
            return 0;
        }

    }
}