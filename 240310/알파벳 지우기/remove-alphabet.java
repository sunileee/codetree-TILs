import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int lenA = a.length();
        int lenB = b.length();

        String resultA = "";
        String resultB = "";
        for (int i = 0; i < lenA; i++) {
            if (a.charAt(i) <= '9' && a.charAt(i) >= '0') {
                resultA += a.charAt(i);
            }
        }

        for (int i = 0; i < lenB; i++) {
            if (b.charAt(i) <= '9' && b.charAt(i) >= '0') {
                resultB += b.charAt(i);
            }
        }

        System.out.print(Integer.parseInt(resultA) + Integer.parseInt(resultB));
    }
}