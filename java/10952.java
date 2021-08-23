import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	while(true) {
    		st = new StringTokenizer(br.readLine());
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		
    		if(A == 0 & B == 0)
    			break;
    		else
    			bw.write((A + B) + "\n");
    	}
    	
    	bw.flush();
    	bw.close();
    }
}
