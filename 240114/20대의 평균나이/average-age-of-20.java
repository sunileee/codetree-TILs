import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int sum = 0;
        int cnt = 0;
       
        while (true) {
            a = sc.nextInt();
            
            if (a < 20 || a >= 30) {
                break;
            }

            sum += a;
            cnt++;
           
        }

        System.out.printf("%.2f", (double) sum / cnt);
    }
}