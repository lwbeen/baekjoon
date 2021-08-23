import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	
    	int n1 = (B % 10) * A;
    	int n2 = ((B % 100) / 10) * A;
    	int n3 = (B / 100) * A;
    	int r = n1 + n2 * 10 + n3 * 100;
    	
    	System.out.println(n1);
    	System.out.println(n2);
    	System.out.println(n3);
    	System.out.println(r);
    }
}
