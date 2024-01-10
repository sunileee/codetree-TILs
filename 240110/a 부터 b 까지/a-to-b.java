import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a;
        for (int i = a; sum <= b; i++) {
            System.out.print(sum + " ");

            if (i % 2 == 1) {
                sum *= 2;
            } else {
                sum += 3;
            }
        }
    }
}