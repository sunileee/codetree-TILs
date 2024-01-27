import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int lastNum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                lastNum = i;
                break;
            }
        }

        for (int i = lastNum - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}