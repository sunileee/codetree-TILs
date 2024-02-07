import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int profit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    int p = arr[j] - arr[i];
                    if (p > profit && p > 0) {
                        profit = arr[j] - arr[i];
                    }
                }
            }
        }

        System.out.print(profit);
    }
}