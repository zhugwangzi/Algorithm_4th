package chaptor1_3;
public class Test19<Item>{
	private class Node{//������
		Item item;
		Node next;
	}
	private Node first;//�׽��
	private int N;//������
	public Node createNode(Item item) {
		Node x=new Node();
		x.item=item;
		return x;
	}
	public void add(Item x) {//���ͷ��ӽ��
		Node p=createNode(x);
		p.next=first;
		first=p;
	}
	public void delete() {//ɾ��β���
		if(N==1) {//ֻ��1������ɾ���׽��
			first=null;
		}else {
			Node p=first;//ָ����ָ��first
			for(;p.next.next!=null;p=p.next);//ѭ������ʱpָ�����ڶ������
			p.next=null;//ɾ��β���
		}
		N--;
	}
	public static void main(String[] args) {
		Test19<String> t=new Test19<String>();//�������������t
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		t.add("f");
		t.delete();
		//����Ԫ�صĵ�һ�ַ�ʽ
		for(Test19<String>.Node x=t.first;x!=null;x=x.next) {
			System.out.print(x.item+"  ");
		}
		//����Ԫ�صĵڶ��ַ�ʽ
		Test19<String>.Node p=t.first;
		/*Node p=first�ᱨ��
		 * �ڲ������ʵ������Ҫ���ⲿ��Ķ�����򷽷���ʵ��
		 */
		System.out.println();
		for(int i=0;i<t.N;i++) {
			System.out.print(p.item+"  ");
			p=p.next;
		}
		//�����ַ�ʽ�ǵ�����
	}
}
