import java.util.Scanner;

public class Main_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		int m1 = in.nextInt();
		int n1 = in.nextInt();
		int b[][] = new int[m1][n1];
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {
				b[i][j] = in.nextInt();
			}
		}
		int num = in.nextInt();
		if (num == 1) {
			int re[][] = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					re[i][j] = a[i][j] + b[i][j];
				}
			}
			for (int i = 0; i < m ; i++) {
				for (int j = 0; j < n-1; j++) {
					System.out.print(re[i][j] + " ");
				}
				System.out.println(re[i][n - 1]);
			}
		} else if (num == 2) {

			int re1[][] = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					re1[i][j] = a[i][j] + b[i][j];
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n-1; j++) {
					System.out.print(re1[i][j] + " ");
				}
				System.out.println(re1[i][n - 1]);
			}
		} else {
			if (n==m1) {
				int re2[][] = new int[m][n1];
				int c = 0, k = 0;

				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n1; j++) {
						for (k = 0; k < n; k++) {
							c += a[i][k] * b[k][j];
							re2[i][j] = c;
						}
						c=0;
					}
					
				}
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n1 - 1; j++) {
						System.out.print(re2[i][j] + " ");
					}
					System.out.println(re2[i][n1 - 1]);
				}
			}
		}
	}
}
