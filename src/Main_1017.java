import java.util.ArrayList;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.Scanner;
  

public class Main_1017 {  
	static int n;
    /** 
     * ʹ��createList�������������б��ݹ�����List��Ĭ����Integer,һ����������ͣ�������޸ı������ 
     */  
    public void createList(int k,List list){  
        if(k==0){  
            k=n;  
        }  
        for(int i=1;i<=k;i++){  
            list.add(i);  
        }  
    }  
    /** 
     * printAll�����ȫ���еĵݹ���÷�����list�Ǵ����list����LinkedListʵ�֣� 
     * ��prefix����ת���Լ���������� 
     * length���ڼ��س�ʼlist�ĳ��ȣ������жϳ�������� 
     */  
    public void printAll(List candidate, String prefix,int length){  
        if(prefix.length()==length)  
             System.out.println(prefix );  
        for (int i = 0; i < candidate.size(); i++) {  
             List temp = new LinkedList(candidate);  
             printAll(temp, prefix + temp.remove(i),length);  
        }  
    }  
  
    /** 
     * ���Դ��� 
     */  
    public static void main(String[] args) {  
    	Scanner in = new Scanner(System.in);
    	n = in.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();  
        Main_1017 lap=new Main_1017();  
        lap.createList(n, list);  
        lap.printAll(list,"",list.size());  
    }  
} 