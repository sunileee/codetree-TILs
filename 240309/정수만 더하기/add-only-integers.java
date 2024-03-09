import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int sum = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= arr[i] && arr[i] <= '9') {
                sum += (int) arr[i] - 48;
            }
        }

        System.out.print(sum);
    }
}