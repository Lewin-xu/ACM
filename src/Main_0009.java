import java.util.Scanner;

public class Main_0009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.next();
			char[] a = new char[s.length()];
			System.out.println("#include<stdio.h>");
			System.out.println("int main(){");
			System.out.println("int x[32768];");
			System.out.println("int p=0;");
			for (int i = 0; i < a.length; i++)
			{
				a[i] =s.charAt(i);
				System.out.println(com(a[i]));}
			System.out.println("return 0;");
			System.out.println("}");

		}
	}

	private static String com(char a) {
		String s = "";
		if (a=='>')
			s = "p++;";
		else if (a=='<')
			s = "p--;";
		else if (a=='+')
			s = "x[p]++;";
		else if (a=='-')
			s = "x[p]--;";
		else if (a=='.')
			s = "putchar(x[p]);";
		else if (a==',')
			s = "x[p]=getchar();";
		else if (a=='[')
			s = "while(x[p]!=0){";
		else if (a==']')
			s = "}";
		return s;
	}
}

