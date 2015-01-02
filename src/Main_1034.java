import java.util.Scanner;
public class Main_1034 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		for (int i = 0; i < n; i++) {
//			int a=in.nextInt();	
//			String b=Long.toBinaryString(a);
//			int l=b.length();
//			if(l<32){
//				for(int j=32;j>l;j--)
//					b="0"+b;
//			}
//		   String re= new StringBuilder(b).reverse().toString();
//			String z=Integer.valueOf(re,2).toString();
//			System.out.println(z);
//			
//		}
//	}
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int T = in.nextInt();
	    for(int i = 0; i < T; i++) {
	        long num = in.nextLong();
	        String s = Long.toBinaryString(num);
	        int l = s.length();
	        if(l <= 32) {
	            for(int j = 32; j > l; j--)
	                s = "0" + s;
	            String re = new StringBuilder(s).reverse().toString();
	            long out = Long.valueOf(re, 2).longValue();
	            System.out.println(out);
//	            System.out.println("Input:  " + num + "    (Binary: " + s+ ")");
//	            System.out.println("Output: " + out + "    (Binary: " + r+ ")");
	        } 
	    }
	   in.close();
	}
}
