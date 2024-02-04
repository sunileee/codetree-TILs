import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = arr[0];
        int maxIdx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIdx = i;
            }
        }

        System.out.print(maxVal + " ");
        arr[maxIdx] = 0;

        int maxVal2 = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal2) {
                maxVal2 = arr[i];
            }
        }

        System.out.print(maxVal2);
    }
}