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
        for (i = 0; i < n1; i++) {
            boolean check = true;

            for (int j = 0; j < n2; j++) {
                if(i + j >= n1) {
                    check = false;
                    break;
                }
                
                if(A[i + j] != B[j]) {
                    check = false;
                    break;
                }
            }

            if(check) {
                System.out.print("Yes");
                System.exit(0);
            }
        }

        System.out.print("No");
    }
}