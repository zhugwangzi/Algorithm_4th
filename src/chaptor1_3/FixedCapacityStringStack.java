package chaptor1_3;
import edu.princeton.cs.algs4.*;
class FixedCapacityStringStack{
	private String[] a;//�洢�ַ���ջ������
	private int N;//�ַ���ջ������
	public FixedCapacityStringStack(int cap) {
		a=new String[cap];//ָ���ַ���ջ������cap,cap>=N
	}
	public boolean isFull() {
		return N==a.length;
	}
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public void push(String item) {
		a[N++]=item;//���Ԫ��
	}
	public String pop() {
		return a[--N];//�������һ��Ԫ����N��һ
	}                  
}

