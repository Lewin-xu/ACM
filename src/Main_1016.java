import java.util.Arrays;
import java.util.Scanner;

public class Main_1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i=0;
		while(i<n){
			int j=0;
		int num=in.nextInt();
		int max=in.nextInt();
		int[] a=new int[num];
			i++;
			int k=0;
            for(j=0;j<num;j++){
            	a[j]=in.nextInt();
            }
            Arrays.sort(a);
            for(j=0;j<num;j++){
            	if(k<max){
            		k+=a[j];
            	}
            	else
            		break;
            	 
            }
            j-=1;
            if(j>=0){
            System.out.println(j);}
            else{
            	System.out.println(0);
            }
            System.out.println();
		}
		
	}

}
