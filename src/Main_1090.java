import java.util.Arrays;
import java.util.Scanner;

public class Main_1090 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int j=n-1, k, count=0;
		for(k=0;k<n;k++){
		 for (; j > 0; j--) {
			if (a[j] + a[k] <= w&&j>k){
				count++;
			   break;}
		}
		 j--;
		if(j<=k) break;
		}
		System.out.println(a.length-count);
	}

}
