import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int grade = a == 100 ? 0 : 1;
        if (grade == 0) {
            System.out.println("pass");
        } else {
            System.out.println("failure");
        }
    }
}