package chaptor1_3;
public class Test21<Item> {
	private class Node{
		Node next;
		Item item;
	}
	private int N;//Ԫ�ظ���
	private Node first;//�׽��
	public void add(Item item) {
		if(N==0) {
			first=new Node();
			first.item=item;
		}else {
			Node p;//ָ����
			for(p=first;p.next!=null;p=p.next);//������p����β���
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
		Boolean b=t.find(t.new Node(), "c");//new Node()�ᱨ��
		System.out.println(b);
	}

}
