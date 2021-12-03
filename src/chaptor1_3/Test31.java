package chaptor1_3;
public class Test31<Item> {
	public class DoubleNode{//˫������
		Item item;
		DoubleNode prev;//ָ��ǰһ��
		DoubleNode next;//ָ���һ��
	}
	private static int N;
	private DoubleNode first;
	private DoubleNode last;
	public DoubleNode createNode(Item item) {
		DoubleNode t=new DoubleNode();
		t.item=item;
		return t;
	}
	public void addFirst(Item item) {//���ͷ���Ԫ��
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
	public void addLast(Item item) {//���β���Ԫ��
		if(N==0) {
			last=createNode(item);
			first=last;
		}else {
			DoubleNode p;//ָ����
			for(p=first;p.next!=null;p=p.next);//������pָ��β���
			DoubleNode t=createNode(item);
			t.prev=last;
			last.next=t;
			last=t;
		}
		N++;
	}
	public void deleteFirst() {//ɾ����ͷ
		if(N==1){
			first=null;
			last=null;
		}else {
			first=first.next;
			first.prev=null;
		}
		N--;
	}
	public void deleteLast() {//ɾ����β
		if(N==1) {
			last=null;
			first=null;
		}else {
			DoubleNode p;//ָ����
			for(p=first;p.next!=null;p=p.next);//������pָ��β���
			last=p.prev;
			last.next=null;
		}
		N--;
	}

	public void insertBefore(Item x,Item y) {//xΪָ������ֵ��yΪ�����ֵ
		DoubleNode t=first;//ָ��t��ʼֵΪfirst
		while(!t.item.equals(x)) {//t����ֱ���ҵ�ָ�����
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
	public void insertAfter(Item x,Item y) {//xΪָ������ֵ��yΪ�����ֵ
		DoubleNode t=first;//ָ��t��ʼֵΪfirst
		while(!t.item.equals(x)) {//t����ֱ���ҵ�ָ�����
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
	public void delete(Item x) {//xΪָ������ֵ
		DoubleNode t=first;//ָ��t��ʼֵΪfirst
		while(!t.item.equals(x)) {//t����ֱ���ҵ�ָ�����
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
		System.out.println("������"+N);
//		t.deleteFirst();
//		t.deleteLast();
		t.insertAfter("c","��");
//		t.insertBefore("a","4");
		t.delete("g");
		System.out.println("������"+N);
		System.out.print("�ӱ�ͷ������");
		for(Test31<String>.DoubleNode x=t.first;x!=null;x=x.next) {
			System.out.print(x.item+" ");
		}
		System.out.print("\n�ӱ�β������");
		for(Test31<String>.DoubleNode x=t.last;x!=null;x=x.prev) {
			System.out.print(x.item+" ");
		}
	}
}