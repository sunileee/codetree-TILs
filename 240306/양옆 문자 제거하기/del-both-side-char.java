import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.charAt(0) + str.substring(2);
        str = str.substring(0, str.length()-2) + str.substring(str.length() - 1);

        System.out.print(str);
    }
}