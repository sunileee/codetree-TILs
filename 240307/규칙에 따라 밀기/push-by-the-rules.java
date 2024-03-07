import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String q = sc.next();
        int len = a.length();

        for (int i = 0; i < q.length(); i++) {
            char c = q.charAt(i);

            if (c == 'L') {
                a = a.substring(1) + a.substring(0, 1);
            }
            else {
                a = a.substring(len-1) + a.substring(0, len-1);
            }
        }

        System.out.print(a);
    }
}