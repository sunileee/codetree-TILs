import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
           if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                System.out.print(str.charAt(i));
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                System.out.print((char)(str.charAt(i) - 'a' + 'A'));
        }

    }
}