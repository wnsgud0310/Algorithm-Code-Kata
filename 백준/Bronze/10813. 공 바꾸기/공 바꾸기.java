import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 공을 바꾸는 횟수

        int[] arr = new int[N];
        
        // 초기 바구니 상태 설정 (1부터 N까지)
        for(int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        // 공 바꾸는 과정
        for(int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            // 인덱스는 0부터 시작하니까 -1 해주기
            int temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }

        // 결과 출력
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
