import java.util.Scanner;

public class Main_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			int count = 0, Count = 0, CH = 0, SI = 0,si=0;
			String s = in.nextLine();
			count = s.length();
			if (count > 2) {
				int[] b = new int[s.length()];
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
						Count++;
						b[j] = 1;
					}
				}
				if (b[0] == 1 && b[1] == 0)
					SI++;
				if (b[b.length - 1] == 1 && b[b.length - 2] == 0)
					SI++;
				for (int j = 1; j < b.length - 1; j++) {
					if (b[j] == 1 && b[j - 1] == 0 && b[j + 1] == 0)
						SI++;
				}
				for (int j = 1; j < b.length - 1; j++) {
					if (b[j] == 0 && b[j - 1] == 1 && b[j + 1] == 1)
						si++;
				}
				for (int j = 0; j < b.length; j++) {
					for (int z = 0; z <= j; z++) {
						if (b[j] == 1 && b[z] == 1) {
							if (j == z + 1)
								CH++;
						}
					}
				}
				int swap=0;
				if(SI<si){
					swap=SI;
					SI=si;
					si=swap;
				}
				count = count + Count * 2 - CH * 2 -SI;
				System.out.println(count);
			} else if (count == 1) {
				if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
					System.out.println("2");
				else
					System.out.println("1");
			} else if (count == 2) {
				for (int j = 0; j < 2; j++) {
					if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
						Count++;
					}
				}
				if (Count == 0)
					System.out.println("2");
				else if (Count == 1)
					System.out.println("3");
				else if (Count == 2)
					System.out.println("4");
			}

		}
	}
}
