import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int midScore = sc.nextInt();
        int finalScore = sc.nextInt();

        if (midScore >= 90) {
            if(finalScore >= 95) {
                System.out.print("100000");
            }
            else if (finalScore >= 90) {
                System.out.print("50000");
            }
            else {
                System.out.print("0");
            }
        }
        else {
            System.out.print("0");
        }
    
    }
}