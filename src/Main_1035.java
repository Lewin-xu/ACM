import java.math.BigInteger;
import java.util.Scanner;

public class Main_1035 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			String res = "";
			String s = Integer.toBinaryString(num);
			int l = s.length();
			if (l <= 32) {
				for (int j = 32; j > l; j--)
					s = "0" + s;
				String f = s.substring(0, 16);
				String g = s.substring(16);
				res = g + f;
				long out = Long.valueOf(res, 2).longValue();
				System.out.println(out);
			}
		}
	}
}
