import java.util.Scanner;

public class Main_1020 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int b = in.nextInt();
		for (int i = n - 1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			if(a[i]==b){
				a[i]=-1;
			}
		}
		for (int i = n - 1; i>=0; i--) {
			if(a[i]!=-1){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}
