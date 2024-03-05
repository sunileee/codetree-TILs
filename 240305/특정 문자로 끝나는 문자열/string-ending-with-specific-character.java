import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        boolean exsit = false;
        for (int i = 0; i < 10; i++) {
            int size = arr[i].length();
            if (arr[i].charAt(size-1) == c) {
                System.out.println(arr[i]);
                exsit = true;
            }
        }

        if (!exsit) {
            System.out.print("None");
        }
    }
}