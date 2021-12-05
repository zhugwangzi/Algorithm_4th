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
	public void addLast(Item item) {//向表尾添加元素
		if(N==0) {
			first=createNode(item);
		}else {
			Node p;//指针结点
			for(p=first;p.next!=null;p=p.next);//结束后p指向尾结点
			p.next=createNode(item);
		}
		N++;
	}
	public void removeAfter(Node x) {
		Node p;//指针结点
		if(x==null) {return;	}
		for(p=first;p!=null;p=p.next) {//遍历每个结点
			if(p.item.equals(x.item)) {//查找到参数结点
				if(p.next==null) {return;}//参数结点的后序结点为空
				p.next=p.next.next;//删除后续结点
				N--;
			}
		}
	}
	public static void main(String[] args) {
		Test24<String> t=new Test24<String>();
		t.addLast("a");
		t.addLast("b");
		t.addLast("c");
		t.addLast("d");
		t.addLast("e");
		for(Test24<String>.Node x=t.first;x!=null;x=x.next) {
			System.out.print(x.item+" ");
		}
		Test24<String>.Node n=t.createNode("c");
		t.removeAfter(n);
		Test24<String>.Node p=t.new Node();
		p=t.first;
		System.out.println("\n移除c后面的节点后，原链表：");
		for(int i=0;i<t.N;i++) {
			System.out.print(p.item+" ");
			p=p.next;
		}
	}
}
