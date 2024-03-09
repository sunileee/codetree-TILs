import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
    
        int count = 0;
        while (true) {
            if (a.equals(b))
                break;

            a = a.substring(1) + a.substring(0, 1);
            count++;
        }

        System.out.print(count);
    }
}