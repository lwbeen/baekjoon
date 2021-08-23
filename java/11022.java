import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i = 1; i <= T; i++) {
    		st = new StringTokenizer(br.readLine());
    		int n1 = Integer.parseInt(st.nextToken());
    		int n2 = Integer.parseInt(st.nextToken());
    		bw.write("Case #" + i + ": " + n1 + " + " + n2 + " = " + (n1 + n2) + "\n");
    	}
    	
    	bw.flush();
    	bw.close();
    }
}
