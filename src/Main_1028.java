	import java.util.Scanner;
	
	
	public class Main_1028 {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			for(int i=0;i<n;i++){
				int x1=in.nextInt();
				int y1=in.nextInt();
				int r1=in.nextInt();
				int x2=in.nextInt();
				int y2=in.nextInt();
				int r2=in.nextInt();
				double x=(x2-x1)*(x2-x1);
				double y=(y2-y1)*(y2-y1);
				double d=Math.sqrt(x+y);
				double r=r1+r2;
				if(d<r){
					System.out.println("Yes");
				}
				else
					System.out.println("No");
			}
			
		}
	}
