import java.util.Scanner;

public class Main_1021 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = 0;
		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
				"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z", " " };
		String[] numbers = { "21", "22", "23", "31", "32", "33", "41", "42",
				"43", "51", "52", "53", "61", "62", "63", "71", "72", "73",
				"74", "81", "82", "83", "91", "92", "93", "94", "#" };
		in.nextLine();
		while (i < n) {
			i++;
			String s = in.nextLine();
			String[] a = s.split("");
			for (int j = 0; j < a.length; j++) {

				for (int k = 0; k < letters.length; k++) {
					if (("" + a[j]).equals(letters[k])) {
						System.out.print(numbers[k]);
						
					}
				}
			}
			System.out.println();
		}
	}
}
