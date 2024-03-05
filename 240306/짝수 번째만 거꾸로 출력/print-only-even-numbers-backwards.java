import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int size = str.length() / 2;

        char[] charArr = new char[size];
        int n = 0;

        for (int i = 1; i < str.length(); i+=2) {
            charArr[n] = str.charAt(i);
            n++;
        }

        for (int i = size-1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }
    }
}