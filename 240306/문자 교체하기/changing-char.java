import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String changeStr = str1.substring(0,2);
        char[] arr = str2.toCharArray();
        arr[0] = changeStr.charAt(0);
        arr[1] = changeStr.charAt(1);

        System.out.print(String.valueOf(arr));
    }
}