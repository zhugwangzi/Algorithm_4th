package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test15 {
	public static void main(String[] args) {
		System.out.println("输入k");
		int k=StdIn.readInt();
		System.out.println("输入字符串，一行一个，end结束");
		Queue<String> q=new Queue<String>();
		String str="";
		while(!str.equals("end")){
			
			str=StdIn.readLine();
			if(!str.equals("end")) {
				q.enqueue(str);//除end 外其余字符串入列
			}
		}
		int i=0;
		for(String x:q){
			if(i++==q.size()-k) {
				System.out.println("倒数第"+k+"个字符串: "+x);
				break;
			}
		}
	}
}
