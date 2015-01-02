import java.util.Scanner;

public class Main_1070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int x3 = in.nextInt();
			int y3 = in.nextInt();
			int x4 = in.nextInt();
			int y4 = in.nextInt();
			boolean b = (x2 - x4) * (x3 - x1) + (y2 - y4) * (y3 - y1) == 0;
			boolean c = (x2 - x4) * (x2 - x4) + (y2 - y4) * (y2 - y4) == (x3 - x1)
					* (x3 - x1) + (y3 - y1) * (y3 - y1);
            if(b&&c){
            	System.out.println("YES");
            }
            else{
            	System.out.println("NO");
            }
		}
	}
}
