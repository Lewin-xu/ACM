
import java.util.Scanner;

public class Main_1098 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] x = new long[n];
		String m = in.nextLine();
		for (int i = 0; i < n; i++) {
	
			String s = in.nextLine();
			String[] a = s.split(" ");
			long a0;
			long a2;
			if(a[1].equals("+")){
				a0 = Integer.parseInt(a[0]);
				a2 = Integer.parseInt(a[2]);
				x[i] = a0 + a2;
			}
			if(a[1].equals("-")){
				a0 = Integer.parseInt(a[0]);
				a2 = Integer.parseInt(a[2]);
				x[i] = a0 - a2;
			}
			if(a[1].equals("*")){
				a0 = (long)Integer.parseInt(a[0]);
				a2 =(long) Integer.parseInt(a[2]);
				x[i] = a0 * a2;
			}
			
		}
		for(int i = 0;i<n;i++){
			System.out.println(x[i]);
		}

	}

}
