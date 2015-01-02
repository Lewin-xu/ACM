import java.util.Scanner;

public class Main_1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int r = 0, i = 0;
		for (r = 0; r < n; r++)
			a[r] = in.nextInt();

		for (i = 0; i < n; i++) {
			int x = a[i] % 10;
			int y = a[i] / 10 % 10;
			int z = a[i] / 100;
			if (a[i] == x * x * x + y * y * y + z * z * z) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}

	}

}
