import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int prize = 0;

        if (A == B && B == C) { // 같은 눈 3개
            prize = 10000 + A * 1000;
        } else if (A == B || A == C) { // 같은 눈 2개 (A와 B 또는 A와 C)
            prize = 1000 + A * 100;
        } else if (B == C) { // 같은 눈 2개 (B와 C)
            prize = 1000 + B * 100;
        } else { // 모두 다른 눈
            int max = Math.max(A, Math.max(B, C));
            prize = max * 100;
        }

        System.out.println(prize);
    }
}
