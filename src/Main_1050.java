import java.util.Scanner;

public class Main_1050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[][] a = new int[n][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = in.nextInt();
			}
		}
		int x = in.nextInt();
		int y = in.nextInt();
		int d = 0;
		for (int i = 0; i < n; i++) {
			boolean j = a[i][0] <= x && (a[i][2]+a[i][0]) >= x && a[i][1] <= y
					&&(a[i][3]+a[i][1]) >= y;
			if (j) {
				d=i+1;
			}
		}
		System.out.println(d);
	}

}
