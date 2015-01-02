import java.util.Scanner;


public class Main_1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in =new Scanner(System.in);
   int D=in.nextInt();
   int H=in.nextInt();
   int M=in.nextInt();
   long d=(D-11)*24*60+H*60+M-671;
   if(d<0){
	   System.out.println("-1");
   }else{
	   System.out.println(d);
   }
	}

}
