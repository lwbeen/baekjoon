import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	int cnt = 0;
    	int r = N;
    	
    	while(true) {
    		r = ((r % 10) * 10) + (((r / 10) + (r % 10)) % 10);
    		cnt++;
    		
    		if(N == r)
    			break;
    	}
    	System.out.println(cnt);
    }
}
