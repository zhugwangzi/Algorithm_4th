package chaptor1_3;
public class Test28<Item>{
	private class Node{
		Node next;
		Item item;
	}
	private int N;
	private Node first;
	public Node createNode(Item item) {
		Node x=new Node();
		x.item=item;
		return x;
	}
	public void add(Item x) {
		if(N==0) {
			first=new Node();
			first.item=x;
		}else {
			Node p;
			for(p=first;p.next!=null;p=p.next);//循环结束后p是尾结点
			Node last=new Node();
			last.item=x;
			p.next=last;
		}
		N++;
	}
	public int max(Node x) {//参数x其实用不着
		return getMax(first,(int)first.item);//调用getMax(Node x,int max)方法
	}
	public int getMax(Node x,int max) {//递归时x和max会一直变化
		if(x==null) {//结束条件：若x是尾结点后的null，则结束
			return max;
		}
		if((int)x.item>max) {//保证max始终为最大值
			max=(int)x.item;
		}
		return getMax(x.next, max);//参数换成（后续结点，max）
	}
	public static void main(String[] args) {
		Test28<Integer> t=new Test28<Integer>();
		t.add(1);
		t.add(3);
		t.add(4);
		t.add(8);
		t.add(12);
		t.add(2);
		t.add(32);
		t.add(23);
		System.out.println(t.max(t.first));
	}
}
