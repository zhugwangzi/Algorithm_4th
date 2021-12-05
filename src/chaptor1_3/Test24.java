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
	public void addLast(Item item) {//���β���Ԫ��
		if(N==0) {
			first=createNode(item);
		}else {
			Node p;//ָ����
			for(p=first;p.next!=null;p=p.next);//������pָ��β���
			p.next=createNode(item);
		}
		N++;
	}
	public void removeAfter(Node x) {
		Node p;//ָ����
		if(x==null) {return;	}
		for(p=first;p!=null;p=p.next) {//����ÿ�����
			if(p.item.equals(x.item)) {//���ҵ��������
				if(p.next==null) {return;}//�������ĺ�����Ϊ��
				p.next=p.next.next;//ɾ���������
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
		System.out.println("\n�Ƴ�c����Ľڵ��ԭ����");
		for(int i=0;i<t.N;i++) {
			System.out.print(p.item+" ");
			p=p.next;
		}
	}
}
