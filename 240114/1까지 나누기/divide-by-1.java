import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        int pre = n;
        for (int i = 1; i <= n; i++) {
            cnt++;
            pre /= i;
            if (pre <= 1) {
                break;
            }
        }

        System.out.println(cnt);
        
    }
}