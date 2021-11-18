package chaptor1_3;
import java.util.Scanner;
import edu.princeton.cs.algs4.*;
public class QueueAndStack {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Stack<String> stack=new Stack<String>();
		Queue<String> queue=new Queue<String>();
		System.out.println("输入多个数据:");
		while(true) {
			String str=s.nextLine();
			
			if(str.equals("")) {
				break;
			}
			stack.push(str);//入栈
			queue.enqueue(str);//入列
		}
		s.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		System.out.println("下压栈的出栈顺序：");
		for(String i:stack) {
			System.out.print(stack.pop()+" ");//出栈剩余元素个数减少
			System.out.println("栈剩余元素个数："+stack.size());
		}
		System.out.println("\n队列的出列顺序：");
		for(String i:queue) {
			String n=queue.dequeue();
			System.out.print(n+" ");//出列
			System.out.println("队列剩余元素个数："+queue.size());
		}
	}		
}
