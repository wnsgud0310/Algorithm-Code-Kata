import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 정수 개수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();  // 배열 입력
        }

        int v = sc.nextInt();  // 찾으려는 수
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
