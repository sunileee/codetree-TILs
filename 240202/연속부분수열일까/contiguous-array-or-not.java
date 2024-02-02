import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] A = new int[n1];
        int[] B = new int[n2];

        int i;
        for (i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        for (i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        int cnt = 0;
        boolean check = false;
        for (i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (j != n2 - 1) {
                    if (A[i] == B[j] && A[i+1] == B[j+1]) {
                        check = true;
                    }
                }
            }
        }

        String checkStr = check ? "Yes" : "No";
        System.out.print(checkStr);
    }
}