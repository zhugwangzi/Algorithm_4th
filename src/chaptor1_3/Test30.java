package chaptor1_3;
public class Test30<Item> {
	public class Node{
		Node next;
		Item item;
	}
	private int N;
	private Node first;
	public Node createNode(Item item){
		Node t=new Node();
		t.item=item;
		return t;
	}
	public void add(Item item) {//向表尾添加结点
		if(N==0) {
			first=createNode(item);
		}else {
			Node x;//指针结点
			Node t=createNode(item);//创建结点t
			for(x=first;x.next!=null;x=x.next);//x指向尾结点
			x.next=t;//添加t到x后面
		}
		N++;
	}
//	public Node reverse(Node x) {//方法1：依次复制结点到新链表
//		if(N==0) {
//			return null;
//		}
//		Node reverse=createNode(first.item);//新链表的首结点
//		for(x=first.next;x!=null;x=x.next) {
//			Node t=createNode(x.item);//复制当前结点到t
//			t.next=reverse;//添加t到reverse前面
//			reverse=t;//重命名t为reverse
//		}
//		first=reverse;//重命名reverse为first
//		return first;
//	}
	public Node reverse(Node x) {//方法2：依次翻转 → 为 ←
		if(N<2) {
			return first;
		}
		Node left=first;//把first①变成left①→first②→right③
		first=first.next;
		Node right=first.next;
		left.next=null;//null←left①←first②  right③
		first.next=left;
		while(right!=null) {
			left=first;//left,first,right往右移
			first=right;
			right=first.next;
			first.next=left;//left  first→right变成left←first  right
		}
		return first;
	}
	public static void main(String[] args) {
		Test30<String> t=new Test30<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		t.add("f");
		t.add("g");
		System.out.println(t.reverse(t.first));
		for(Test30<String>.Node x=t.first;x!=null;x=x.next) {
			System.out.println(x.item);
		}
	}
}
