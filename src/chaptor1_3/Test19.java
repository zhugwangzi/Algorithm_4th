package chaptor1_3;
public class Test19<Item>{
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
		if(isEmpty()) {//若为空表则创建首节点，对first赋值
			first =new Node();
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
	public void delete() {//删除尾结点
		if(size()==1) {//只有1个结点就删除首结点
			first=null;
		}else {
			Node p=first;//指针结点指向first
			for(;p.next.next!=null;p=p.next);//循环结束时p指向倒数第二个结点
			p.next=null;//删除尾结点
		}
		N--;
	}
	public static void main(String[] args) {
		Test19<String> t=new Test19<String>();//创建集合类对象t
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		t.add("f");
		t.delete();
		//遍历元素的第一种方式
		for(Test19<String>.Node x=t.first;x!=null;x=x.next) {
			System.out.print(x.item+"  ");
		}
		//遍历元素的第二种方式
		Test19<String>.Node p=t.first;
		/*Node p=first会报错
		 * 内部类对象实例化需要在外部类的对象、类或方法中实现
		 */
		System.out.println();
		for(int i=0;i<t.size();i++) {
			System.out.print(p.item+"  ");
			p=p.next;
		}
		//第三种方式是迭代器
	}
}
