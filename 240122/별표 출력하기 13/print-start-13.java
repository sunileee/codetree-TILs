import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = odd; j < n; j++) {
                    System.out.print("* ");
                }
                odd++;
            } else {
                for (int j = 0; j <= even; j++) {
                    System.out.print("* ");
                }
                even++;
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                for (int j = odd; j < n; j++) {
                    System.out.print("* ");
                }
                odd++;
            } else {
                for (int j = 0; j <= even; j++) {
                    System.out.print("* ");
                }
                even++;
            }
            System.out.println();
        }

    }
}