import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = (int)a + 1;

        if(a == 'z')
            System.out.print("a");
        System.out.print((char)b);
    }
}