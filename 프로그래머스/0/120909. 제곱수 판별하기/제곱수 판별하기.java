import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        List<Integer> numList = IntStream.range(1, 1001)
                                         .map(num -> num * num)
                                         .boxed()
                                         .collect(Collectors.toList());
        Iterator<Integer> iterator = numList.iterator();

        while (iterator.hasNext()) {
            if (n == iterator.next()) {
                return 1; // n이 제곱수인 경우 1을 반환
            }
        }
        return 2; // n이 제곱수가 아닌 경우 2를 반환
    }
}
