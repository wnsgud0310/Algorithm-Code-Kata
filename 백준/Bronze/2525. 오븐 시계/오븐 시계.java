import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 현재 시
        int B = sc.nextInt(); // 현재 분
        int C = sc.nextInt(); // 요리 시간 (분 단위)

        int totalMinutes = A * 60 + B + C; // 전체 시간(분) 계산
        int endHour = (totalMinutes / 60) % 24; // 종료 시각 (24시간 형식 유지)
        int endMinute = totalMinutes % 60; // 종료 분

        System.out.println(endHour + " " + endMinute);
    }
}
