import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        int len = str.length();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            switch (type) {
                case 1: {
                    str = str.substring(1) + str.substring(0, 1);
                    System.out.println(str);
                    break;
                }
                case 2: {
                    str = str.substring(len-1) + str.substring(0, len - 1);
                    System.out.println(str);
                    break;
                }
                case 3: {
                    char[] arr = str.toCharArray();
                    char[] result = new char[len];
                    for (int j = len-1; j >= 0; j--) {
                        result[len-1 - j] = arr[j];
                    }
                    System.out.println(String.valueOf(result));
                    break;
                }
            }
        }
    }
}