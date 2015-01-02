import java.text.DecimalFormat;
import java.util.Scanner;


public class Main_1022 {
	final static double n=(Math.sqrt(3))/3;
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	double a=in.nextDouble();
	double b=a*n;
	DecimalFormat df=new DecimalFormat("0.000000");
	System.out.println(df.format(b));
	}
}
