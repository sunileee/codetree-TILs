import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        if (a == 'a') {
            System.out.print('z');
        }
        else {
            int b = (int) a - 1;
            System.out.print((char)b);
        }
    }
}