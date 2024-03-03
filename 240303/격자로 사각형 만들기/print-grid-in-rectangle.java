import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr2d = new int[n][n];

        int i, j;
        for (i = 0; i < n; i++) {
            arr2d[0][i] = 1;
            arr2d[i][0] = 1;
        }

        for (i = 1; i < n; i++) {
            for (j = 1; j < n; j++) {
                arr2d[i][j] = arr2d[i-1][j-1] + arr2d[i-1][j] + arr2d[i][j-1];
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}