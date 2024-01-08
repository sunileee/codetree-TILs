import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String aCold = sc.next();
        int aTmp = sc.nextInt();
        String bCold = sc.next();
        int bTmp = sc.nextInt();
        String cCold = sc.next();
        int cTmp = sc.nextInt();

        char a = getColdYn(aCold, aTmp);
        char b = getColdYn(bCold, bTmp);
        char c = getColdYn(cCold, cTmp);

        int e = 0;
        if (a == 'A') {
            e++;
        }
        
        if (b == 'A') {
            e++;
        }

        if (c == 'A') {
            e++;
        }

        if (e >= 2) {
            System.out.print("E");
        } else {
            System.out.print("N");
        }
    }

    static char getColdYn(String cold, int tmp) {
        if (cold.equals("Y") && tmp >= 37) {
            return 'A';
        } else if (cold.equals("N") && tmp >= 37) {
            return 'B';
        } else if (cold.equals("Y") && tmp < 37) {
            return 'C';
        } else {
            return 'D';
        }
    }
}