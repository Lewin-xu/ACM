import java.util.Arrays;
import java.util.Scanner;

public class Main_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			long num1 = 0, num2 = 0;
			long num3 = 0, num4 = 0, num5 = 0;
			int a[] = new int[3];
			for (int j = 0; j < 3; j++) {
				a[j] = in.nextInt();
			}
			Arrays.sort(a);
			if (a[0] > 2) {
				num3 = 1 + (a[0] - 1) / 3 + (a[1] - 1) / 3 + (a[2] - 1) / 3;
				num4 = 2 + (a[0] - 2) / 3 + (a[1] - 2) / 3 + (a[2] - 2) / 3;
				num5 = 3 + (a[0] - 3) / 3 + (a[1] - 3) / 3 + (a[2] - 3) / 3;
				long M = 0;
				if (num3 > num4)
					M = num3;
				else
					M = num4;
				if (M < num5)
					M = num5;
				System.out.println(M);
			} else if (a[0] == 0) {
				System.out.println(a[1] / 3 + a[2] / 3);
			} else if (a[0] == 1) {
				num1 = a[0] + (a[1] - a[0]) / 3 + (a[2] - a[0]) / 3;
				num2 = a[0] / 3 + a[1] / 3 + a[2] / 3;
				if (num1 > num2) {
					System.out.println(num1);
				} else {
					System.out.println(num2);
				}

			}else if(a[0]==2){
				num1 = a[0] + (a[1] - a[0]) / 3 + (a[2] - a[0]) / 3;
				num2 = a[0] / 3 + a[1] / 3 + a[2] / 3;
				if (num1 > num2) {
					System.out.println(num1);
				} else {
					System.out.println(num2);
				}
			}

		}

	}

}
