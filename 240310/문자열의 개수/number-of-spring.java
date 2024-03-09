import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int index = 0;
        String[] arr = new String[201];
        for(int i = 0; i < 200; i++) {
            String str = sc.next();
            
            if(str.equals("0"))
                break;
            
            if (i % 2 == 0) {
                arr[index] = str;
                index++;
            }
            count++;
        }

        System.out.println(count);
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
}