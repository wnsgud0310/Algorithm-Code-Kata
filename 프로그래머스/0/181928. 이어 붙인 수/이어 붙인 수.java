class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddStr = new StringBuilder(); // 홀수 문자열
        StringBuilder evenStr = new StringBuilder(); // 짝수 문자열
        
        for(int num: num_list){
            if(num%2==0){
                evenStr.append(num);
            }else{
                oddStr.append(num);
            }
        }
        
        int odd = Integer.parseInt(oddStr.toString());
        int even = Integer.parseInt(evenStr.toString());
        
        return odd + even;
    }
}