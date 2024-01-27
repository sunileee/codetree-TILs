import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 65;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) a);
                if ((char) a == 'Z') {
                    a = 65;
                }
                else {
                    a++;
                }
            }
            System.out.println();
        }
    }
}