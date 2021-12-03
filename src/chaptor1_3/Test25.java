package chaptor1_3;
public class Test25 <Item>{
	private class Node{
		Node next;
		Item item;
	}
	public Node createNode(Item item) {
		Node x=new Node();
		x.item=item;
		return x;
	}
	private int N;
	private Node first;
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
	public void insertAfter(Node n1,Node n2) {
		if(n1==null||n2==null) {//参数有一个为空则立刻结束
			return;
		}
		Node p;
		for(p=first;p!=null;p=p.next) {
			if(p.item.equals(n1.item)) {//在链表中找到n1
				n2.next=p.next;//插入n2结点
				p.next=n2;
				N++;
			}
		}
	}
	public static void main(String[] args) {
		Test25<String> t=new Test25<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		Test25<String>.Node n1=t.createNode("c");
		Test25<String>.Node n2=t.createNode("f");
		t.insertAfter(n1,n2);
		System.out.println(t.N);
		Test25<String>.Node p=t.first;
		for(;p!=null;p=p.next) {
			System.out.println(p.item);
		}
	}
}
