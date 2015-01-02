import java.util.Arrays;
import java.util.Scanner;

public class Main_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int n = in.nextInt();
			long x = 0;
			long a[] = new long[n];
			int k = in.nextInt();
			int r = in.nextInt()+k;
			for (int j = 0; j < n; j++) {
				a[j] = in.nextLong();
			}
			Arrays.sort(a);
			long[][] b = new long[n][n];
			for (int p = 0; p < b.length; p++) {
				for (int w = 0; w < b.length; w++)
					b[p][w] = -1000001;
			}
			for (int j = 0; j < a.length; j++) {
				for (int z = 0; z <= j; z++) {
					x = a[j] + a[z];
					if (x >= r)
						b[j][z] = x;
				}
			}
			int q = 0, z = 0, h = 0;
			long[] c = new long[n * n];
			for (q = 0; q < b.length; q++) {
				for (z = 0; z < b[q].length; z++) {
					c[h] = b[q][z];
					h++;
				}
			}
			Arrays.sort(c);
			int g = 0;
			for (g = 0; g < c.length; g++) {
				if (c[g] >= r) {
					System.out.println(c[g]);
					break;
				}
			}
			if (c[c.length - 1] < r) {
				System.out.println("-1");
			}
		}
	}
}
