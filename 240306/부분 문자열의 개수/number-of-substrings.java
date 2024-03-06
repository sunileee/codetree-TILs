import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int count = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            boolean isContains = false;
            for (int j = 0; j < b.length() - 1; j++) {
                if (a.charAt(i) == b.charAt(j) && a.charAt(i+1) == b.charAt(j+1)) {
                    isContains = true;
                }
                else {
                    isContains = false;
                }
            }

            if (isContains) count++;
        }

        System.out.print(count);
    }
}