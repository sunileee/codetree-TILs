import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a / b + ".");
        a %= b;
        for(int i = 0; i < 20; i++) {
            // 나머지에 10 곱한 값을 기준으로
            // b로 나누었을 떄의 몫을 구해줍니다.
            a *= 10;
            System.out.print(a / b);
            
            // a를 b로 나눈 나머지를 게속 갱신해줍니다.
            a %= b;
        }
    }
}