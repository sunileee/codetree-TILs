import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999)
                break;
        }

        int maxVal = arr[0];
	    int minVal = arr[0];
        
        for(int i = 1; i < 100; i++) {
            if(arr[i] == 999 || arr[i] == -999)
                break;
            
            if(arr[i] > maxVal)
                maxVal = arr[i];
            
            if(arr[i] < minVal)
                minVal = arr[i];
        }

        System.out.print(maxVal + " " + minVal);
    }
}