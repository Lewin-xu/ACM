import java.util.*;
public class Main_1101 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			double a[] = new double[n];
			double b[] = new double[n];
			double c[] = new double[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				b[i] = in.nextInt();
				c[i] = in.nextInt();
			
			}
			for (int i = 0; i < n; i++) {
				double delta =b[i] * b[i] - 4 * a[i] * c[i];
				if (a[i] == 0 && b[i] == 0 && c[i] == 0) {
	            System.out.println("Infinite");
				}
				else if(delta<0||a[i]==0&&b[i]==0){
		        	   System.out.println("No solution");
		           }
				else if(a[i]==0&&b[i]!=0){
					double root=(-c[i])/b[i];
					System.out.printf(String.format("%.2f", root));
					System.out.println();
				}
				else if(a[i]!=0&&delta==0){
					double root=(-1*b[i])/(2*a[i]);
					System.out.printf(String.format("%.2f", root));
					System.out.println();
				}
				else if(a[i]>0){
					double root1=((-b[i])-Math.pow(delta, 1 / 2))/(2*a[i]);
					double root2=((-b[i])+Math.pow(delta, 1 / 2))/(2*a[i]);
					System.out.printf(String.format("%.2f", root1)+" "+String.format("%.2f", root2));
				    System.out.println();
				}
				else{
					double root1=((-b[i])+Math.pow(delta, 1 / 2))/(2*a[i]);
					double root2=((-b[i])-Math.pow(delta, 1 / 2))/(2*a[i]);
					System.out.printf(String.format("%.2f", root1)+" "+String.format("%.2f", root2));
				    System.out.println();
				}
				
			}
			
		}

	}
//import java.text.DecimalFormat;
//import java.util.Scanner;
//
//public class Main_1101 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		double a[] = new double[n];
//		double b[] = new double[n];
//		double c[] = new double[n];
//		DecimalFormat df = new DecimalFormat("0.00");
//
//		for (int i = 0; i < n; i++) {
//			a[i] = in.nextDouble();
//			b[i] = in.nextDouble();
//			c[i] = in.nextDouble();
//		}
//
//		for (int i = 0; i < n; i++) {
//			double delta = b[i] * b[i] - 4 * a[i] * c[i];
//
//			if (a[i] == 0 && b[i] == 0 && c[i] == 0)
//				System.out.println("Infinite");
//
//			else if ((a[i] == 0 && b[i] == 0) || (delta < 0))
//				System.out.println("No solution");
//
//			else if (a[i] != 0 && delta == 0) {
//				double root = (-b[i]) / (2 * a[i]);
//				System.out.println(df.format(root));
//			} else if (a[i] == 0 && b[i] != 0) {
//				double root = (-c[i]) / b[i];
//				System.out.println(df.format(root));
//			} else if (a[i] > 0) {
//				double root1 = ((-b[i]) - Math.pow(delta, 1 / 2)) / (2 * a[i]);
//				double root2 = ((-b[i]) + Math.pow(delta, 1 / 2)) / (2 * a[i]);
//				System.out.println(df.format(root1) + " " + df.format(root2));
//			} else {
//				double root1 = ((-b[i]) + Math.pow(delta, 1 / 2)) / (2 * a[i]);
//				double root2 = ((-b[i]) - Math.pow(delta, 1 / 2)) / (2 * a[i]);
//				System.out.println(df.format(root1) + " " + df.format(root2));
//
//			}
//		}
//	in.close();
//	}
//}
//
//
//
//
