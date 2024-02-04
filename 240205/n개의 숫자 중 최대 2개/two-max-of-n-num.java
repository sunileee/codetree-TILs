import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = Integer.MIN_VALUE;
        int maxVal2 = Integer.MIN_VALUE;

        int maxIdx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIdx = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == maxIdx)
                continue;

            if (arr[i] > maxVal2) {
                maxVal2 = arr[i];
            }
        }

        System.out.print(maxVal + " " + maxVal2);
    }
}