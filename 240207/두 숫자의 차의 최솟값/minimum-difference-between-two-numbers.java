import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minusValue = 100;
        for (int i = 0; i < n-1; i++) {
            if (arr[i+1] - arr[i] < minusValue) {
                minusValue = arr[i+1] - arr[i];
            }
        }

        System.out.print(minusValue);
    }
}