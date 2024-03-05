import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String str1 = a + b;
        String str2 = b + a;

        System.out.print(str1.equals(str2));
    }
}