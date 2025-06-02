import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 입력: 줄 수
        
        for (int i = 1; i <= N; i++) {  // 1부터 N까지 줄 반복
            for (int j = 1; j <= i; j++) {  // 각 줄마다 i개만큼 별 출력
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }
    }
}
