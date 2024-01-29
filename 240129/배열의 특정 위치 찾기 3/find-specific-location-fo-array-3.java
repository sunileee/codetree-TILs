import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int point = 0;
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                point = i;
                break;
            }
        }

        for (int j = point - 1; j >= point - 3; j--) {
            sum += arr[j];
        }

        System.out.print(sum);
    }
}