package chaptor1_3;
import edu.princeton.cs.algs4.*;
class FixedCapacityStringStack{
	private String[] a;//存储字符串栈的数组
	private int N;//字符串栈的容量
	public FixedCapacityStringStack(int cap) {
		a=new String[cap];//指定字符串栈的容量cap,cap>=N
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
		a[N++]=item;//添加元素
	}
	public String pop() {
		return a[--N];//弹出最后一个元素且N减一
	}                  
}

