import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        boolean isContains = true;
        while (isContains) {
            if (a.contains(b)) {
                a = a.replace(b,"");
            }
            else {
                isContains = false;
            }
        }

        System.out.print(a);
    }
}