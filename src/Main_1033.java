import java.util.Scanner;

public class Main_1033 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			int a=in.nextInt();
			String b=Integer.toBinaryString(a);
			String[] c= b.split("");
			int k=0;
			for(int j=0;j<c.length;j++){
				if(c[j].equals("1")){
					k++;
				}
			}
			System.out.println(k);
		}
	}
}
