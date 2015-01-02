import java.util.Scanner;

public class Main_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.next();
			String[] f = s.split("");
			System.out.println("#include<stdio.h>");
			System.out.println("int main(){");
			System.out.println("int x[32768];");
			System.out.println("int p=0;");
			for (int i = 0; i < f.length; i++) {
				String z = com(f[i]);
				System.out.println(z);
			}
			System.out.println("return 0;");
			System.out.println("}");

		}
	}

	private static String com(String f) {
		String s = "";
		if (f.equals(">"))
			s = "p++;";
		else if (f.equals("<"))
			s = "p--;";
		else if (f.equals("+"))
			s = "x[p]++;";
		else if (f.equals("-"))
			s = "x[p]--;";
		else if (f.equals("."))
			s = "putchar(x[p]);";
		else if (f.equals(","))
			s = "x[p]=getchar();";
		else if (f.equals("["))
			s = "while(x[p]!=0){";
		else if (f.equals("]"))
			s = "}";
		return s;
	}
}
