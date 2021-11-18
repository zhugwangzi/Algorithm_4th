package chaptor1_3;
public class Test27<Item> {
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
	public int max(Node x) {
		int max=(int)first.item;
		for(Node i=first;i!=null;i=i.next) {
			if((int)i.item>max) {
				max=(int)i.item;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Test27<Integer> t=new Test27<Integer>();
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
