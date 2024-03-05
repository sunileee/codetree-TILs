import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String ee = str.contains("ee")? "Yes" : "No";
        String ab = str.contains("ab")? "Yes" : "No";

        System.out.print(ee + " " + ab);        
    }
}