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
			for(p=first;p.next!=null;p=p.next);//ѭ��������p��β���
			Node last=new Node();
			last.item=x;
			p.next=last;
		}
		N++;
	}
	public void insertAfter(Node n1,Node n2) {
		if(n1==null||n2==null) {//������һ��Ϊ�������̽���
			return;
		}
		Node p;
		for(p=first;p!=null;p=p.next) {
			if(p.item.equals(n1.item)) {//���������ҵ�n1
				n2.next=p.next;//����n2���
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
