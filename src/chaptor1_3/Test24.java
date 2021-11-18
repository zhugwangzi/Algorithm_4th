package chaptor1_3;
public class Test24 <Item>{
	private class Node{
		Item item;
		Node next;
	}
	private int N;
	private Node first;
	public Node createNode(Item item) {
		Node x=new Node();
		x.item=item;
		return x;
	}
	public void add(Item item) {//向表尾添加元素
		if(N==0) {
			first=new Node();
			first.item=item;
		}else {
			Node p;//指针结点
			for(p=first;p.next!=null;p=p.next);//结束后p指向尾结点
			Node last=new Node();
			last.item=item;
			p.next=last;
		}
		N++;
	}
	public void removeAfter(Node x) {
		Node p;//指针结点
		if(x==null) {//参数结点为空
			return;
		}
		for(p=first;p!=null;p=p.next) {//遍历每个结点
			if(p.item.equals(x.item)) {//查找到参数结点
				if(p.next==null) {//参数结点的后序结点为空
					return;
				}
				p.next=p.next.next;//删除后续结点
				N--;
			}
		}
	}
	public static void main(String[] args) {
		Test24<String> t=new Test24<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		Test24<String>.Node n=t.createNode("c");
		t.removeAfter(n);
		
		Test24<String>.Node p=t.new Node();
		p=t.first;
		for(int i=0;i<t.N;i++) {
			System.out.println(p.item);
			p=p.next;
		}
	}
}
