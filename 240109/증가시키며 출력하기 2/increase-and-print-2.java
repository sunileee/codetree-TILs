import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 5;                  // 시작 값(초기화식)

        while (i <= 10) {           // 계속 반복할 조건(조건식)
            System.out.println(i);  // 원하는 코드 작성
            i++;                    // 원하는 증감값 설정(증감식)
        }
    }
}