import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = n % 2 == 0 ? n : n - 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    if(i == 0) 
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else {
                    if(i <= j)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}