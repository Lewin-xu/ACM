import java.util.Arrays;
import java.util.Scanner;

public class Main_1092 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int h = in.nextInt()+30;
		int count=0;
		for(int j=0;j<a.length;j++){
			if(a[j]<=h) count++;
		}
		System.out.println(count);
	}

}
