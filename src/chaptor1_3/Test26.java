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
<<<<<<< HEAD
	public void add(Item x) {//���ͷ��ӽ��
		Node p=createNode(x);
		p.next=first;
		first=p;
	}
//������β��ӽ��͸��鷳
//		if(N==0) {
//			first=createNode(x);
//		}else {
//			Node p;
//			for(p=first;p.next!=null;p=p.next);//ѭ��������p��β���
//			p.next=createNode(x);
//		}
//		N++;
	public void remove(Node x,String key) {
		N=0;//�����������
		Node m=null;
		for(x=first;x!=null;x=x.next) {//����ԭ����
			if(!x.item.equals(key)) {//��ӷ�key��㵽��ͷmǰ��
				Node t=createNode(x.item);
				t.next=m;
				m=t;
				N++;
			}
		}
		first=m;
=======
	public void add(Item x) {
		if(N==0) {
			first=new Node();
			first.item=x;
		}else {
			Node p;
			for(p=first;p.next!=null;p=p.next);//ѭ��������p��β���
			Node last=new Node();
			last.item=x;
			p.next=last;
		}
		N++;
	}
	public void remove(Node x,String key) {
		if(key==null||N==0) {
			return;
		}
		while(first.item.equals(key)) {//��֤firstΪ��key���
			first = first.next;
			N--;
			if(N==0) {
				return;
			}
		}
		//�½�һ���ɷ�key��㹹�ɵ������׽��Ϊm
		Node m=createNode(first.item);
		N=1;//�����������
		for(x=first.next;x!=null;x=x.next) {//����ԭ����
			if(!x.item.equals(key)) {//��ӷ�key��㵽��ͷmǰ��
				Node second=m;
				m=createNode(x.item);
				m.next=second;
				N++;
			}
		}
		first=m;//��t�޸ı���Ϊfirst
>>>>>>> 202976f3c5e3b649e616edd6dc61ecc7070802cb
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
<<<<<<< HEAD
		String key="d";
=======
		String key="3";
>>>>>>> 202976f3c5e3b649e616edd6dc61ecc7070802cb
		t.remove(x,key);
		System.out.println(t.N);
		Test26<String>.Node p=t.first;
		for(;p!=null;p=p.next) {
			System.out.println(p.item);
		}
	}
}
