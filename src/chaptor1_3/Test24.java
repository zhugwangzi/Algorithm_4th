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
	public void add(Item item) {//���β���Ԫ��
		if(N==0) {
			first=createNode(item);
		}else {
			Node p;//ָ����
			for(p=first;p.next!=null;p=p.next);//������pָ��β���
			Node last=createNode(item);
			p.next=last;
		}
		N++;
	}
	public void removeAfter(Node x) {
		Node p;//ָ����
		if(x==null) {//�������Ϊ��
			return;
		}
		for(p=first;p!=null;p=p.next) {//����ÿ�����
			if(p.item.equals(x.item)) {//���ҵ��������
				if(p.next==null) {//�������ĺ�����Ϊ��
					return;
				}
				p.next=p.next.next;//ɾ���������
				N--;
			}
		}
	}
	public static void main(String[] args) {
		Test24<String> t=new Test24<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		Test24<String>.Node n=t.createNode("c");
		t.removeAfter(n);
		for(Test24<String>.Node x=t.first;x!=null;x=x.next) {
			System.out.println(x.item);
		}
	}
}
