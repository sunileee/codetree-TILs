import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = "";
        for (int i = 0; i < n; i++) {
            str += sc.next();
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (count == 4) {
                System.out.println(str.charAt(i));
                count = 0;
                continue;
            }
            else {
                System.out.print(str.charAt(i));
                count++;
            }
        }
    }
}