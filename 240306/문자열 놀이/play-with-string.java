import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();

        char[] arr = s.toCharArray();
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                arr = s.toCharArray();
                int a = sc.nextInt();
                int b = sc.nextInt();

                char temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
                s = String.valueOf(arr);

            }
            else if (type == 2) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                
                s = s.replace(a, b);
            }

            System.out.println(s);
        }
    }
}