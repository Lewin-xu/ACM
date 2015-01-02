import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int N = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int min=0,max=0;
		    if(a>b){
		    	min=b;
		    	max=a;
		    }
		    else{
		    	min=a;
		    	max=b;
		    }
			int j = 0;
			int num = 0;
			for (int k = 0; k < N; k++) {
					num = N - k * min;
					if (num % max == 0)
						j++;

				}
			if (j == 0){
			    if(max%min!=0||max==min){
				System.out.println("No");}
			    else
			    	System.out.println("Yes");
			}
			else
				if(max<N&&(N%a!=0&&N%b!=0||max%min==0)){
				System.out.println("Yes");}
				else{
					System.out.println("No");
				}
			
		}

	}

}
