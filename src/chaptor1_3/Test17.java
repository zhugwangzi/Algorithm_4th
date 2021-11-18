package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test17 {
	public static Transaction[] readTransactions(Queue<String> q) {
		int n=q.size();
		Transaction[]  t=new Transaction[n];
		for(int i=0;i<n;i++) {
			t[i]=new Transaction(q.dequeue());
		}
		return t;
	}
	public static void main(String[] args) {
		System.out.println("输入多行数据");
		String str;
		Queue<String> q=new Queue<String>();
		while(true){
			str=StdIn.readLine();
			if(str.equals("")) {
				break;
			}
			q.enqueue(str);
		}
		Transaction[] t=readTransactions(q);
		for(Transaction x:t) {
			System.out.println(x);
		}
	}
}
