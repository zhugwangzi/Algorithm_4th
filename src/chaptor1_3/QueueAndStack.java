package chaptor1_3;
import java.util.Scanner;
import edu.princeton.cs.algs4.*;
public class QueueAndStack {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Stack<String> stack=new Stack<String>();
		Queue<String> queue=new Queue<String>();
		System.out.println("����������:");
		while(true) {
			String str=s.nextLine();
			
			if(str.equals("")) {
				break;
			}
			stack.push(str);//��ջ
			queue.enqueue(str);//����
		}
		s.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		System.out.println("��ѹջ�ĳ�ջ˳��");
		for(String i:stack) {
			System.out.print(stack.pop()+" ");//��ջʣ��Ԫ�ظ�������
			System.out.println("ջʣ��Ԫ�ظ�����"+stack.size());
		}
		System.out.println("\n���еĳ���˳��");
		for(String i:queue) {
			String n=queue.dequeue();
			System.out.print(n+" ");//����
			System.out.println("����ʣ��Ԫ�ظ�����"+queue.size());
		}
	}		
}
