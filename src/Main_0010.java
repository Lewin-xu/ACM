import java.util.*;

public class Main_0010 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int s = 88888888;
			int n = in.nextInt();
			int k = in.nextInt();
			int r = in.nextInt();
			int b[] = new int[n];
			for (int j = 0; j < n; j++) {
				b[j] = in.nextInt();
			}
			Arrays.sort(b);
			if (2 * b[n - 1] - r < k)
				System.out.println("-1");
			else {
				int x = 0, y = n - 1;
				while (x <= y) {
					if (b[x] + b[y] - r >= k) {
						if (s > b[x] + b[y])
							s = b[x] + b[y];
						y--;
					} else {
						x++;
					}
				}
				System.out.println(s);
			}

		}

	}
}