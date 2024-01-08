import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aAge = sc.nextInt();
        String aSex = sc.next();
        int bAge = sc.nextInt();
        String bSex = sc.next();

        if ((aAge >= 19 && aSex.charAt(0) == 'M') || (bAge >= 19 && bSex.charAt(0) == 'M')) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}