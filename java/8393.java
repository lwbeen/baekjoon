import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int n = Integer.parseInt(br.readLine());
    	int temp = 0;
    	
    	for(int i = 1; i <= n; i++)
    		temp += i;
    	
    	bw.write(temp + "");
    	
    	bw.flush();
    	bw.close();
    }
}
