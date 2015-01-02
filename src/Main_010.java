import java.util.Arrays;
import java.util.Scanner;

public class Main_010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int n = in.nextInt();
			long x = 0;
			long a[] = new long[n];
			int k = in.nextInt();
			int r = in.nextInt();
			for (int j = 0; j < n; j++) {
				a[j] = in.nextLong();
			}
			Arrays.sort(a);
			if (a[a.length - 1] * 2 -r< k)
				System.out.println("-1");
			else {
				long s = 8888888;
				 for (int j = 0; j < a.length; j++) {
					for (int p = 0; p <= j; p++) {
						x = a[p] + a[j] - r;
						if (x >= k) {
							if (x < s)
								s = x;
						}
					}
				}
				System.out.println(s);
			}
		}
	}
}
