import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int d = (int)'a' - (int)'A';

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ('a' <= arr[i] && arr[i] <= 'z') {
                int a = (int) arr[i] - d;
                System.out.print((char)a);
            }
            else if ('A' <= arr[i] && arr[i] <= 'Z') {
                int a = (int) arr[i] + d;
                System.out.print((char)a);           
            }
        }
    }
}