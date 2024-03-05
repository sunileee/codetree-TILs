import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i].length();
            if (arr[i].charAt(0) == 'a') {
                count++;
            }
        }

        System.out.printf("%d %d", sum, count);

    }
}