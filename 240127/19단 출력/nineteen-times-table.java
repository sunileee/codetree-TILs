public class Main {
    public static void main(String[] args) {
        int cnt = 1;

        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                if (cnt >= 2 || j >= 19) {
                    System.out.println(i + " * " + j + " = " + i * j);
                    cnt = 1;
                }
                else {
                    System.out.print(i + " * " + j + " = " + i * j + " / ");
                    cnt++;
                }
            }
        }
    }
}