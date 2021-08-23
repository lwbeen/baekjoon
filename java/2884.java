import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int m = sc.nextInt();
    	
    	if(m > 45)
    		System.out.println(h + " " + (m - 45));
    	else {
    		if(h > 0)
    			System.out.println((h - 1) + " " + (m + 15));
    		else
    			System.out.println("23 " + (m + 15));
    	}
    }
}
