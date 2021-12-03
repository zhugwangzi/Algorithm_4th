package chaptor1_3;
public class Test21<Item> {
	private class Node{
		Node next;
		Item item;
	}
	private int N;//元素个数
	private Node first;//首结点
	public void add(Item item) {
		if(N==0) {
			first=new Node();
			first.item=item;
		}else {
			Node p;//指针结点
			for(p=first;p.next!=null;p=p.next);//结束后p就是尾结点
			Node last=new Node();
			last.item=item;
			p.next=last;
		}
		N++;
	}
	public boolean find(Node x,String key) {
		for(x=first;x.next!=null;x=x.next) {
			if(x.item.equals(key)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Test21<String> t=new Test21<>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		Boolean b=t.find(t.new Node(), "c");//new Node()会报错
		System.out.println(b);
	}

}
