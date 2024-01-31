import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[99];
        int[] countArr = new int[10];
        int point = 99;

        for (int i = 0; i < 99; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                point = i;
                break;
            }
        }

        for (int i = point - 1; i >= 0; i--) {
            countArr[arr[i] / 10]++;   
        }

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d - %d\n", i, countArr[i]);
        }
    }
}