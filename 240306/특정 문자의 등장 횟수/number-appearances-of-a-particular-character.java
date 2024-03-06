import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int eeCount = 0;
        int ebCount = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i+1) == 'e') {
                eeCount++;
            }

            if (str.charAt(i) == 'e' && str.charAt(i+1) == 'b') {
                ebCount++;
            }
        }

        System.out.printf("%d %d", eeCount, ebCount);
    }
}