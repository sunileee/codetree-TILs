import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-"); // - 기준으로 잘라서 입력 받겠다는 뜻
        int month = sc.nextInt(); // - 기호가 나오기 전까지 입력 진행
        int day = sc.nextInt(); // - 기호가 나오기 전까지 입력 진행
        int year = sc.nextInt(); // - 기호가 나오기 전 or 입력의 마지막 부분까지 진행
        System.out.println(year + "." + month + "." + day);
    }
}