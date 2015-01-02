import java.io.*;
import java.util.*;

public class Main_01019 {
	public static void main(String[] args) throws IOException {
		new Main_01019().run();
	}

	StreamTokenizer in;
	PrintWriter out;

	int nextInt() throws IOException {
		in.nextToken();
		return (int) in.nval;
	}

	void run() throws IOException

	{

		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(
				System.in)));

		out = new PrintWriter(new OutputStreamWriter(System.out));

		solve();

		out.flush();

	}

	void solve() throws IOException

	{

		int j=nextInt();
		int[] a =new int[j];
		j=a.length;
        for(int i=0;i<j;i++){
        	a[i]=nextInt();
        }
	    Arrays.sort(a);
	   for(int i=0;i<j;i++){
		   out.print(a[i]+" ");
	   }
	}

}