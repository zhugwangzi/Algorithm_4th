package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test14{
	private int N;//栈容量初始值为1
	private String[] a=new String[1];
	public boolean isEmpty() {//是否为空集
		return N==0;
	}
	public int size() {//栈的容量
		return N;
	}
	public void resize(int max) {//调整数组容量
		String[] t=new String[max];
		for(int i=0;i<N;i++) {
			t[i]=a[i];
		}
		a=t;
	}
	public void enqueue(String s) {//元素入列
		if(N==a.length) {//判断栈是否满，满了就扩大为2倍
			resize(2*a.length);
		}
		a[N++]=s;
	}
	public String dequeue() {//元素出列
		String t=a[0];//获取a[0]
		for(int i=0;i<N-1;i++) {//依次把a[1],a[2],...,a[N-1]往左挪一位
			a[i]=a[i+1];
		}
		a[--N]=null;//避免a[N-1]游离
		if(N>0&&N<=a.length/4) {//判断删除元素后栈容量是否太小
			resize(a.length/2);//栈太小，数组长度就减半
		}
		return t;
	}
	public static void main(String[] args) {
		Test14 s=new Test14();//创建一个对象
		System.out.println("请输入字符串：");
		String str=StdIn.readLine();
		String[] words=str.split(" ");
		System.out.print("弹出的元素是：");
		for(String x:words){
			if(x.equals("-")) {
				System.out.print(s.dequeue()+"   ");
			}else {
				s.enqueue(x);
			}
		}
		System.out.println("\n栈还剩余 "+s.size()+" 个元素");
		for(String x:s.a) {//注意这里s.a才是栈
			System.out.print(x+"  ");
		}
	}
}
