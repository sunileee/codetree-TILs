import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char c = A.charAt(0);

        char[] charArr = new char[1000];
        int[] countArr = new int[1000];
        int point = 0;
        
        for (int i = 0; i < A.length(); i++) {
            if (c == A.charAt(i)) {
                charArr[point] = c;
                countArr[point]++;
                
            }
            else {
                c = A.charAt(i);
                point++;

                charArr[point] = c;
                countArr[point]++;
            }
        }

        int size = (point+1) * 2;
        System.out.println(size);
        for(int i = 0; i <= point; i++) {
            System.out.printf("%c%d", charArr[i], countArr[i]);
        }
    }
}