import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.next();
        String deStr = sc.next();

        if (inStr.contains(deStr)) {
            System.out.print(inStr.indexOf(deStr.charAt(0)));
        }
    }
}