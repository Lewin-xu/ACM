import java.util.Scanner;

public class Main_1089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int d=b-a+1;
			System.out.println(getResult(d));
		}
	}

	public static int getResult(int d) {
		// TODO Auto-generated method stub
		if(d==1||d==2)
		return 1;
		else
			return getResult(d-1)+getResult(d-2);
	}
}
