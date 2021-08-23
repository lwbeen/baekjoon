import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int nlist[] = new int[N];
    	
    	for(int i = 0; i < N; i++)
    		nlist[i] = sc.nextInt();
    	
    	Arrays.sort(nlist);
    	System.out.println(nlist[0] + " " + nlist[N - 1]);
    }
}
