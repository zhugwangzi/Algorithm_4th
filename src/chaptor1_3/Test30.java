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
	public Node reverse1(Node x) {//方法1：依次复制结点到新链表
		if(N<2) {
			return first;
		}
		Node reverse=createNode(first.item);//新链表的首结点
		for(x=first.next;x!=null;x=x.next) {//从第2个结点开始遍历
			Node t=createNode(x.item);//复制当前结点到t
			t.next=reverse;//添加t到reverse前面
			reverse=t;//重命名t为reverse
		}
		first=reverse;//重命名reverse为first
		return first;
	}
	public Node reverse2(Node x) {//方法2：依次翻转 → 为 ←
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
	public Node reverse2_1(Node x) {//方法2优化版
		Node reverse =null;
		Node second;
		for(;first!=null;first=second) {//指针first遍历每个结点
			second=first.next;
			first.next=reverse;//把reverse   first→second变成reverse←first   second
			reverse=first;//指针reverse,first,second右移
		}
		first=reverse;//结束时reverse是尾结点
		return first;
	}
	public Node reverse3(Node x) {//递归翻转x结点后面的整条链表，返回翻转链表的首结点
		if(x==null||x.next==null) {//若x是尾结点或null则返回x
			return x;
		}
		Node second=x.next;//x→second→...→null，递归一次指针x和second就右移一次
		Node rest=reverse3(second);//翻转second结点后面的整条链表，返回翻转链表的首结点
		second.next=x;//把x→second→...变成x←second
		x.next=null;//null←x
		return rest;//递去过程首结点rest一直改变，归来过程不变，且first不再是首结点
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
		Test30<String>.Node x=t.reverse3(t.first);
		for(;x!=null;x=x.next) {
			System.out.println(x.item);
		}
	}
}
