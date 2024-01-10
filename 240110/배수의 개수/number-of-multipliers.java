import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if (num % 3 == 0) {
                cnt1++;
            }

            if (num % 5 == 0) {
                cnt2++;
            }
        }

        System.out.println(cnt1 + " " + cnt2);
    }
}