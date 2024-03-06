import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char firstChar = str.charAt(0);
        char c = str.charAt(1);

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                arr[i] = firstChar;
            }
        }

        System.out.print(String.valueOf(arr));
    }
}