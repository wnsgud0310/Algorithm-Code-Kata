import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum =0;
        //1부터 N까지의합
        for(int i =1; i<=N; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}