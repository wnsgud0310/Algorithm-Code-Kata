class Solution {
    public int solution(int n) {
        // x는 2부터 시작해야한다 1로나누면 나머지가 항상 0
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                return x; 
            }
        }
        return -1; 
    }
}
