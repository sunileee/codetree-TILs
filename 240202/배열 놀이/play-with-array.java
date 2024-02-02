import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int a = sc.nextInt();

            switch (type) {
                case 1:
                    System.out.println(arr[a-1]);
                    break;
                case 2:
                    int cnt = 0;
                    int point = 0;
                    for (int j = 0; j < n; j++) {
                        if (arr[j] == a && cnt == 0) {
                            point = j+1;
                            cnt++;
                        }
                    }
                    System.out.println(point);
                    break;
                case 3:
                    int b = sc.nextInt();
                    for (int j = a; j <= b; j++) {
                        System.out.print(arr[j-1] + " ");
                    }
                    System.out.println();
                    break;
                default:
                break;
            }
        }
    }
}