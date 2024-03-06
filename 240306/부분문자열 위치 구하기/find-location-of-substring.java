import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.next();
        String deStr = sc.next();

        int index = -1;
        if (inStr.contains(deStr)) {
            index = inStr.indexOf(deStr.charAt(0));
        
        }
        System.out.print(index);
    }
}