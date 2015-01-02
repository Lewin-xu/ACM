import java.util.Scanner;

public class Main_01023 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int amu = scan.nextInt();
		int[] N = new int[amu];
		int[] a = new int[amu];
		int[] b = new int[amu];

		for (int i = 0; i < amu; i++) {
			N[i] = scan.nextInt();
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0 && b[i] != 0) {
				for (int x = 1; x <= ((int) N[i] / a[i]); x++) {
					for (int y = 1; y <= (int) N[i] / b[i]; y++) {
						if (((a[i] * x) + (b[i] * y)) == N[i]) {
							count++;
						}
					}
				}
				if (count > 0) {
					System.out.println("Yes");
					count = 0;
				} else {
					System.out.println("No");
					count = 0;
				}
			}
		}
	}
}		