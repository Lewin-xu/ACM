import java.util.*;
public class Main_1019 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int j=in.nextInt();
		int[] a =new int[j];
		j=a.length;
        for(int i=0;i<j;i++){
        	a[i]=in.nextInt();
        }
	    Arrays.sort(a);
	   for(int i=0;i<j;i++){
		   System.out.print(a[i]+" ");
	   }
	}
}