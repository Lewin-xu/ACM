import java.util.Scanner;

public class Main_01 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			long s1=in.nextLong();
			long s2=in.nextLong();
			long s3=in.nextLong();
			long s4=in.nextLong();
			long s = s1 + s2 - s3;
			if (s >= s4)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
	}
}
