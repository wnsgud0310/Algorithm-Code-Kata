import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        for(int i = 0; i < T; i++){ // 
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + (a + b));
        }

        sc.close(); 
    }
}
