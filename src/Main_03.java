import java.util.Scanner;

public class Main_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int swap = 0;
			if (a > b) {
				swap = a;
				a = b;
				b = swap;
			}
			if(a%2==0)
				System.out.println("XMGQMF");
			else
				System.out.println("FBBQMF");
		}
	}

}
