import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                index = i;
                break;
            }
        }

        str = str.substring(0, index) + str.substring(index+1);
        System.out.print(str);

    }
}