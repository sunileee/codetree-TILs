import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int aMath = sc.nextInt();
        int aEnglish = sc.nextInt();
        int bMath = sc.nextInt();
        int bEnglish = sc.nextInt();

        if (aMath == bMath) {
            if (aEnglish > bEnglish) {
                System.out.print("A");
            } 
            else {
                System.out.print("B");
            }
        } 
        else if (aMath > bMath) {
            System.out.print("A");
        } 
        else {
            System.out.print("B");
        }
    }
}