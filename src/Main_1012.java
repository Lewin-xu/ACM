import java.util.Scanner;

public class Main_1012 {
	public static void main(String[] args) {
		int[] d = { 192, 442, 692, 942 };
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		int x = (int)((t - 1) % 4+1);
		t = (t - 1) / 4;
		System.out.println((t == 0 ? "" : "" + t) + d[x-1]);
		in.close();
	}
}