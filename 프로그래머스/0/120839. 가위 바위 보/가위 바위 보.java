import java.lang.StringBuilder;

class Solution {
    public String solution(String rsp) {
        //  가위 바위 보를 내는데 이길려면
        // 바위, 보, 가위가 순서대로 나와야함
        // 0,5,2 가 순서대로 나오게
        StringBuilder sb = new StringBuilder();
        for(String str : rsp.split("")){
            if(str.equals("2")){
                sb.append("0");
            }else if(str.equals("0")){
                sb.append("5");
            }else {
                sb.append("2");
            }
        }
        String answer = sb.toString();
        return answer;
    }

}