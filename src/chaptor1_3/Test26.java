package chaptor1_3;
public class Test26<Item> {
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
	public void remove(Node x,String key) {
		if(key==null||N==0) {
			return;
		}
		while(first.item.equals(key)) {//保证first为非key结点
			first = first.next;
			N--;
			if(N==0) {
				return;
			}
		}
		//新建一条由非key结点构成的链表，首结点为m
		Node m=createNode(first.item);
		N=1;//新链表的容量
		for(x=first.next;x!=null;x=x.next) {//遍历原链表
			if(!x.item.equals(key)) {//添加非key结点到表头m前面
				Node second=m;
				m=createNode(x.item);
				m.next=second;
				N++;
			}
		}
		first=m;//把t修改别名为first
	}
	public static void main(String[] args) {
		Test26<String> t=new Test26<String>();
		t.add("d");
		t.add("e");
		t.add("xb");
		t.add("b");
		t.add("v");
		t.add("d");
		t.add("b ");
		Test26<String>.Node x=t.new Node();
		String key="3";
		t.remove(x,key);
		System.out.println(t.N);
		Test26<String>.Node p=t.first;
		for(;p!=null;p=p.next) {
			System.out.println(p.item);
		}
	}
}
