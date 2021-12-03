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
	public void add(Item x) {//向表头添加结点
		Node p=createNode(x);
		p.next=first;
		first=p;
	}
//如果向表尾添加结点就更麻烦
//		if(N==0) {
//			first=createNode(x);
//		}else {
//			Node p;
//			for(p=first;p.next!=null;p=p.next);//循环结束后p是尾结点
//			p.next=createNode(x);
//		}
//		N++;
	public void remove(Node x,String key) {
		N=0;//新链表的容量
		Node m=null;
		for(x=first;x!=null;x=x.next) {//遍历原链表
			if(!x.item.equals(key)) {//添加非key结点到表头m前面
				Node t=createNode(x.item);
				t.next=m;
				m=t;
				N++;
			}
		}
		first=m;
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
		String key="d";
		t.remove(x,key);
		System.out.println(t.N);
		Test26<String>.Node p=t.first;
		for(;p!=null;p=p.next) {
			System.out.println(p.item);
		}
	}
}
