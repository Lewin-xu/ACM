import java.util.Arrays;
import java.util.Scanner;


public class Main_1081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			for(int i=0;i<n;i++){
			int num = in.nextInt();
			int[] a = new int[num];
			for (int j = 0; j < a.length; j++) {
				a[j] = in.nextInt();
			}
			Arrays.sort(a);
			int time=0;
			for (int j = 0; j < a.length; j++) {
				time+=a[j]*(num-j);
			}
			System.out.println(time);
	}
	}

}
