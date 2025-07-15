import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();           // 과목 수
        int[] scores = new int[N];      // 원래 점수 저장 배열
        int max = 0;

        // 점수 입력 및 최대값 찾기
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        // 조작된 점수들의 합 구하기
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (double) scores[i] / max * 100;
        }

        // 평균 계산
        double average = sum / N;

        System.out.println(average);
    }
}
