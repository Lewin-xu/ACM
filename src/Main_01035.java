import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;

public class Main_01035 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] re = new String[n];
		for (int i = 0; i < n; i++) {
			int K = in.nextInt();
			String a = Integer.toBinaryString(K);
			int c = 32 - a.length();
			StringBuilder e = new StringBuilder();
			for (int o = 0; o < c; o++) {
				e.append("0");
			}
			String d = e.toString() + a;
			// System.out.println(d);
			String f = d.substring(0, 16);
			String g = d.substring(16);
			// System.out.println(f);
			// System.out.println(g);
			re[i] = g + f;

		}
		for (int o = 0; o < n; o++) {
			BigInteger v = new BigInteger(re[o], 2);
			System.out.println(v.toString());
		}
	}
}