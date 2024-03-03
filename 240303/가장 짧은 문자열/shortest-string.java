import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int maxLength = 0;
        int minLength = 0;
        if (str1.length() > str2.length() && str1.length() > str3.length()) {
            maxLength = str1.length();
            minLength = str2.length() > str3.length() ? str3.length() : str2.length();
        } 
        else if (str2.length() > str1.length() && str2.length() > str3.length()) {
            maxLength = str2.length();
            minLength = str1.length() > str3.length() ? str3.length() : str1.length();
        }
        else {
            maxLength = str3.length();
            minLength = str1.length() > str2.length() ? str2.length() : str1.length();
        }

        System.out.print(maxLength - minLength);
    }
}