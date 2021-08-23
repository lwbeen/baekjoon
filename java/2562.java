import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int nlist[] = new int[9];
    	int max = nlist[0];
    	int cnt = 0;
    	
    	for(int i = 0; i < 9; i++) {
    		nlist[i] = Integer.parseInt(br.readLine());
    		
    		if(max < nlist[i]) {
    			max = nlist[i];
    			cnt = i + 1;
    		}
    	}
    	bw.write(max + "\n" + cnt);
    	bw.flush();
    	bw.close();
    }
}
