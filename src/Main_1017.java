import java.util.ArrayList;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.Scanner;
  

public class Main_1017 {  
	static int n;
    /** 
     * 使用createList方法，填充参数列表传递过来的List，默认是Integer,一般是这个类型，你可以修改别的类型 
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
     * printAll是输出全排列的递归调用方法，list是传入的list，用LinkedList实现， 
     * 而prefix用于转载以及输出的数据 
     * length用于记载初始list的长度，用于判断程序结束。 
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
     * 测试代码 
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