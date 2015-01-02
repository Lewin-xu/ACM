import java.util.Scanner;

public class Main_1069 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int re=0;
	   for(int i=0;i<n;i++){
			int r=0;
			int a=in.nextInt();
			int b=in.nextInt();
                     re=a+b-gys(a,b);
                     System.out.println(re);
		}
		
		}
        public static int gys(int x, int y) {
		if (x > y)
			return gys(x - y, y);
		if (x < y)
			return gys(x, y - x);
		return x;
	}
}