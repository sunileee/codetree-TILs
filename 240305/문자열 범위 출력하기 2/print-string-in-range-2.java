import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        for(int i = str.length() - 1; i >= 0; i--) {
            if (i < str.length() - n)
                break;
            System.out.print(str.charAt(i));
        }
    }
}