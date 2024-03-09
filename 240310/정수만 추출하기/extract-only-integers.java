import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        String b;
        String str1;
        String str2;
        
        a = sc.next();
        b = sc.next();

	    int lenA = a.length();
	    int lenB = b.length();

        int idx1 = 0;
	    int idx2 = 0;

        for(int i = 0; i < lenA; i++)
            if(a.charAt(i) <= '9' && a.charAt(i) >= '0')
                idx1++;
            else break;
        
        for(int i = 0; i < lenB; i++)
            if(b.charAt(i) <= '9' && b.charAt(i) >= '0')
                idx2++;
            else break;
        
        str1 = a.substring(0, idx1);
        
        str2 = b.substring(0, idx2);
        
        int str1Int = Integer.parseInt(str1);
        int str2Int = Integer.parseInt(str2);
        
        System.out.print(str1Int + str2Int);
    }
}