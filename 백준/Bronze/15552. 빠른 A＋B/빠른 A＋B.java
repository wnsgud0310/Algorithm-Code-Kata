import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 빠르게 하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄에 테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 공백 기준으로 A, B 나눔
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            // 결과를 버퍼에 저장
            bw.write((A + B) + "\n");
        }

        // 출력은 마지막에 flush 한 번만
        bw.flush();
        bw.close();
        br.close();
    }
}
