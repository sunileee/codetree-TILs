import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        int sum = (int)c1 + (int)c2;
        int minus = (int)c1 > (int)c2 ? (int)c1 - (int)c2 : (int)c2 - (int)c1;
        System.out.print(sum + " " + minus);
    }
}