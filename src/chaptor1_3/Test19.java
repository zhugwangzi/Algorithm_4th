package chaptor1_3;
public class Test19<Item>{
	private class Node{//������
		Item item;
		Node next;
	}
	private Node first;//�׽��
	private int N;//������
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public void add(Item item) {//���β�ڵ�
		if(isEmpty()) {//��Ϊ�ձ��򴴽��׽ڵ㣬��first��ֵ
			first =new Node();
			first.item=item;
		}else {//���ǿձ�
			Node p;//ָ����
			for(p=first;p.next !=null;p=p.next);//ѭ������ʱp��β���
			Node last=new Node();
			last.item=item;
			p.next=last;
		}
		N++;
	}
	public void delete() {//ɾ��β���
		if(size()==1) {//ֻ��1������ɾ���׽��
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
		for(int i=0;i<t.size();i++) {
			System.out.print(p.item+"  ");
			p=p.next;
		}
		//�����ַ�ʽ�ǵ�����
	}
}
