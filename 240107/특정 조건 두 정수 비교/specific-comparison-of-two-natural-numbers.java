import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.printf(1 + " ");
        }
        else {
            System.out.printf(0 + " ");
        }

        if (a == b) {
            System.out.printf(1 + "");
        }
        else {
            System.out.printf(0 + "");
        }
    }
}