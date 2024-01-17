import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;

        for (int i = 0; i < n; i++) {
            for(int j = 1; j <= val; j++) {
                System.out.print("*");
            }
            val += 2;
            System.out.println();
        }
    }
}