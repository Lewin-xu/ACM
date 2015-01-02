import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m1=in.nextInt();
		int m2=in.nextInt();
		int v1=in.nextInt();
		int v2=in.nextInt();
		int v3,v4;
		 v3=((m1+m2)*(v2-v1)+(2*m1*v1-m1*v2+m2*v2)) /(m1+m2);
		 v4=(2*m1*v1-m1*v2+m2*v2)/(m1+m2); 
		 DecimalFormat df=new DecimalFormat("0.00");
		 System.out.print(df.format(v3)+" "+df.format(v4));
	}

}