package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test12{
	public static Stack<String> copy(Stack<String> s){
		Stack<String> copyStack=new Stack<String>();//复制后的栈
		Stack<String> t=new Stack<String>();//临时栈
		for(String x:s) {
			t.push(x);
		}
		for(String x:t) {
			
			copyStack.push(x);
		}
		return copyStack;
	}
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("a");
		s.push("b");
		s.push("c");
		Stack<String> t=copy(s);
		for(String x:t) {
			System.out.println(x);
		}
	}
}
