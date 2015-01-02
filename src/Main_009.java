import java.util.Scanner;

public class Main_009
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		String n;
		while (in.hasNext())
		{
			n = in.next();
			char[] a = new char[n.length()];
			System.out
					.println("#include<stdio.h>\nint main(){\nint x[32768];\nint p=0;");
			for (int i = 0; i < a.length; i++)
			{
				a[i] = n.charAt(i);
				cc(a[i]);
			}  
			System.out.println("return 0;\n}");
		}
	}

	public static void cc(char a)
	{
		switch (a)
		{
		case '>':
			System.out.println("p++;");
			break;
		case '<':
			System.out.println("p--;");
			break;
		case '+':
			System.out.println("x[p]++;");
			break;
		case '-':
			System.out.println("x[p]--;");
			break;
		case '.':
			System.out.println("putchar(x[p]);");
			break;
		case ',':
			System.out.println("x[p]=getchar();");
			break;
		case '[':
			System.out.println("while(x[p]!=0){");
			break;
		case ']':
			System.out.println("}");
			break;
		default:
			break;
		}
	}
}