package chaptor1_3;
//import java.util.Iterator;
public class Test20<Item>{// implements Iterable<Item>
	/*����ʹ�õ��������������Ԫ��
	 * ������ע����ȡ���Ϳ���
	 */
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
		if(isEmpty()) {//��Ϊ�ձ���ֱ�Ӷ�first��ֵ
			first =new Node();//�����׽ڵ�
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
	public void delete(int k) {//ɾ��k��㣬k=0���׽��
		Node p=first;//ָ����ָ��first
		if(k==0) {//ɾ���׽��
			first=first.next;
		}else {
			for(int i=0;i<k-1;i++){//ѭ��k-1�Σ�pָ����k-1
				p=p.next;
			}//p�ǵ�k-1�����
			p.next=p.next.next;//(k-1,k,k+1) ɾ��k���
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
