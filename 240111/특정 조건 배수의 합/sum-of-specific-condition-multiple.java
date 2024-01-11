import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumVal = 0;

        int num1, num2;
        if (a > b) {
            num1 = a;
            num2 = b;
        } else {
            num1 = b;
            num2 = a;
        }

        for (int i = num2; i <= num1; i++) {
            if (i % 5 == 0) {
                sumVal += i;
            }
        }
        
        System.out.println(sumVal);
    }
}