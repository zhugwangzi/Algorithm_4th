package chaptor1_3;
public class Test31<Item> {
	public class DoubleNode{//双向链表
		Item item;
		DoubleNode prev;//指向前一个
		DoubleNode next;//指向后一个
	}
	private static int N;
	private DoubleNode first;
	private DoubleNode last;
	public DoubleNode createNode(Item item) {
		DoubleNode t=new DoubleNode();
		t.item=item;
		return t;
	}
	public void addFirst(Item item) {//向表头添加元素
		if(N==0) {
			first=createNode(item);
			last=first;
		}else {
			DoubleNode t=createNode(item);
			t.next=first;
			first.prev=t;
			first=t;
		}
		N++;
	}
	public void addLast(Item item) {//向表尾添加元素
		if(N==0) {
			last=createNode(item);
			first=last;
		}else {
			DoubleNode p;//指针结点
			for(p=first;p.next!=null;p=p.next);//结束后p指向尾结点
			DoubleNode t=createNode(item);
			t.prev=last;
			last.next=t;
			last=t;
		}
		N++;
	}
	public void deleteFirst() {//删除表头
		if(N==1){
			first=null;
			last=null;
		}else {
			first=first.next;
			first.prev=null;
		}
		N--;
	}
	public void deleteLast() {//删除表尾
		if(N==1) {
			last=null;
			first=null;
		}else {
			DoubleNode p;//指针结点
			for(p=first;p.next!=null;p=p.next);//结束后p指向尾结点
			last=p.prev;
			last.next=null;
		}
		N--;
	}

	public void insertBefore(Item x,Item y) {//x为指定结点的值，y为插入的值
		DoubleNode t=first;//指针t初始值为first
		while(!t.item.equals(x)) {//t右移直到找到指定结点
			t=t.next;
		}
		if(t==first) {
			addFirst(y);
			return;
		}
		DoubleNode m=createNode(y);
		m.next=t;
		t.prev.next=m;
		m.prev=t.prev;
		t.prev=m;
		N++;
	}
	public void insertAfter(Item x,Item y) {//x为指定结点的值，y为插入的值
		DoubleNode t=first;//指针t初始值为first
		while(!t.item.equals(x)) {//t右移直到找到指定结点
			t=t.next;
		}
		if(t==last) {
			addLast(y);
			return;
		}
		DoubleNode m=createNode(y);
		m.next=t.next;
		t.next=m;
		m.prev=t;
		m.next.prev=m;
		N++;
	}
	public void delete(Item x) {//x为指定结点的值
		DoubleNode t=first;//指针t初始值为first
		while(!t.item.equals(x)) {//t右移直到找到指定结点
			t=t.next;
		}
		if(t==last) {
			deleteLast();
		}else if(t==first) {
			deleteFirst();
		}else{
    		t.prev.next=t.next;
		    t.next.prev=t.prev;
		    N--;
		}
	}
	public static void main(String[] args) {
		Test31<String> t=new Test31<String>();
		t.addFirst("a");
		t.addFirst("b");
		t.addFirst("c");
		t.addFirst("d");
		t.addFirst("e");
		t.addFirst("f");
		t.addFirst("g");
		System.out.println("容量："+N);
//		t.deleteFirst();
//		t.deleteLast();
		t.insertAfter("c","恶");
//		t.insertBefore("a","4");
		t.delete("g");
		System.out.println("容量："+N);
		System.out.print("从表头遍历：");
		for(Test31<String>.DoubleNode x=t.first;x!=null;x=x.next) {
			System.out.print(x.item+" ");
		}
		System.out.print("\n从表尾遍历：");
		for(Test31<String>.DoubleNode x=t.last;x!=null;x=x.prev) {
			System.out.print(x.item+" ");
		}
	}
}