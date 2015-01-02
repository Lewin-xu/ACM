import java.util.Scanner;

public class Main_1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum=0;
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		int f = in.nextInt();
		int l = in.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != f) {
				a[i] = 0;
			}
			break;
		}
		for (int j = a.length-1; j > 0; j--) {
			if (a[j] != l) {
				a[j] = 0;
			}
			break;
		}
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			}
		System.out.println(sum);
	}

}
