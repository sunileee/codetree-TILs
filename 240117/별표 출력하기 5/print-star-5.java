import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int repeatVal = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < repeatVal; j++) {
                for(int k = 0; k < repeatVal; k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
            repeatVal--;
        }
    }
}