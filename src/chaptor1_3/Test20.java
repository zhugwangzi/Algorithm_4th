package chaptor1_3;
//import java.util.Iterator;
public class Test20<Item>{// implements Iterable<Item>
	/*若想使用迭代器迭代链表的元素
	 * 把所有注释行取消就可以
	 */
	private class Node{//链表定义
		Item item;
		Node next;
	}
	private Node first;//首结点
	private int N;//结点个数
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public void add(Item item) {//添加尾节点
		if(isEmpty()) {//若为空表则直接对first赋值
			first =new Node();//创建首节点
			first.item=item;
		}else {//不是空表
			Node p;//指针结点
			for(p=first;p.next !=null;p=p.next);//循环结束时p是尾结点
			Node last=new Node();
			last.item=item;
			p.next=last;
		}
		N++;
	}
	public void delete(int k) {//删除k结点，k=0是首结点
		Node p=first;//指针结点指向first
		if(k==0) {//删除首结点
			first=first.next;
		}else {
			for(int i=0;i<k-1;i++){//循环k-1次，p指向结点k-1
				p=p.next;
			}//p是第k-1个结点
			p.next=p.next.next;//(k-1,k,k+1) 删除k结点
		}
		N--;
	}
//	public Iterator<Item> iterator() {
//		return new ListIterator();
//	}
//	private class ListIterator implements Iterator<Item> {
//		Node current = first;
//		public boolean hasNext() {
//			return current != null; 
//		}
//		public Item next() {
//			Item item = current.item;
//			current = current.next;
//			return item;
//		}
//	}
	public static void main(String[] args) {
		Test20<String> t=new Test20<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		t.add("f");
		t.delete(3);
		for(Test20<String>.Node x=t.first;x!=null;x=x.next) {
			System.out.println(x.item);
		}
//		Iterator<String> it=t.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
}
