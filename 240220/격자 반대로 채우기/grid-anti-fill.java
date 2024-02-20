import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        boolean up = true;
        int[][] arr = new int[n][n];
        for (int i = n-1; i >= 0; i--) {
            if (up) {
                for (int j = n-1; j >= 0; j--) {
                    arr[j][i] = count;
                    count++;
                }
                up = false;
            }
            else {
                for (int j = 0; j < n; j++) {
                    arr[j][i] = count;
                    count++;
                }
                up = true;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}