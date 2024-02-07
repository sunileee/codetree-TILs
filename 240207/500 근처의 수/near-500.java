import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = 1;
        int minValue = 1000;
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 500) {
                if (arr[i] > maxValue) {
                    maxValue = arr[i];
                }
            } else {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                }
            }

        }
        
        System.out.printf("%d %d", maxValue, minValue);
    }
}