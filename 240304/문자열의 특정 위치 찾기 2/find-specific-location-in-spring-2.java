import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange" };

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < 5; i++) {
            int size = arr[i].length();
            for (int j = 0; j < size; j++) {
                if (c == arr[i].charAt(2) || c == arr[i].charAt(3)) {
                    System.out.println(arr[i]);
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}