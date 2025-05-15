class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        //s1, s2 돌면서 동일한 문자가있으면 answer에 +1 
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer+=1;
                }
            }
        }
        
        return answer;
    }
}