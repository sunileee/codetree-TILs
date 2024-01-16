import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean satisfied = false;
        for (int i = 1; i <= n; i++) {
            if (n % 1 == 0) {
                satisfied = true;
            }
        }
        if (satisfied == true) {
            System.out.println("C");
        }
        else {
            System.out.println("N");
        }
    }
}