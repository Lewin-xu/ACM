import java.util.Scanner;
 
public class Main_1015 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = in.next();
        }
        String sb = in.nextLine();
        String str = in.nextLine();
        String usb[] = str.split(" ");
        int i, j;
            for(j=0;j<n;j++){
                b:for(i=0;i<usb.length;i++){
                if (s[j].equals(usb[i])) {
                    System.out.println(s[j]);
                    break b;
            } 
             
            }       
        }
    }
}
