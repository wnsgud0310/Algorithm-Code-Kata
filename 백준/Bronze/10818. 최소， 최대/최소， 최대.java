import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정수의 개수
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 오름차순 정렬

        // 정렬했으므로 첫 번째 값이 최솟값, 마지막 값이 최댓값
        System.out.println(arr[0] + " " + arr[N - 1]);

        sc.close();
    }
}
