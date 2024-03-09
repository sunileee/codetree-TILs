import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (('a' <= arr[i] && arr[i] <= 'z') || ('1' <= arr[i] && arr[i] <= '9')) {
                System.out.print(arr[i]);
            }
            else if ('A' <= arr[i] && arr[i] <= 'Z') {
                int v = (int)'a' - (int) 'A';
                int a = (int)arr[i] + v;
                System.out.print((char) a);
            }
        }
    }
}