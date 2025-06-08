import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9]; // 1차원 배열 9개
        
        //배열에 값 입력
        for(int i =0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0]; // 최댓값을 첫 번째 원소로 초기화
        int index = 0; //최댓값의 인덱스
        
        // 배열 탐색하여 최댓값과 위치 찾기
        for(int i = 0; i<9; i++){
            if(arr[i] > max){
                max = arr[i];
                index =i;
                
            }
        }
        System.out.println(max);
        System.out.println(index +1);
        sc.close();
        
    }
}