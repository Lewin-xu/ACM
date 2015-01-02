import java.util.Scanner;

public class Main_1137 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long num;
		long[][] a = new long[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				num = in.nextLong();
				a[i][j] = num;
			}
		}
		long s;
		for (int i = 0; i < n; i++) {
			s = a[i][0] + a[i][1];
			System.out.println(s);
		}

	}

}
