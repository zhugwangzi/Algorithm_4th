package chaptor1_3;
public class Test29<Item> {//��������ʵ�ֶ���Queue
	public class Node{
		Node next;
		Item item;
	}
	private int N;
	private Node last;
//	private Node first;���������first=last.next
	public int size() {
		return N;
	}
	public Node createNode(Item item) {
		Node t=new Node();
		t.item=item;
		return t;
	}
	public void enqueue(Item item) {//����
		Node t=createNode(item);
		if(N==0) {
			last=t;
			last.next=last;
		}else {
/* ע�����ﲻ���ó�����ӷ�ʽ
/*	Node x=last;last=t;x.next=last;
 * ����last.next=null�����ɵ�������
 */
			t.next=last.next;
			last.next=t;
			last=t;
		}
		N++;
	}
	public Item dequeue() {//����(�׽��
		if(N==0) {
			return null;
		}
		Item item;
		if(N==1) {
			item=last.item;
			last=null;
		}else {
			item=last.next.item;
			last.next=last.next.next;
		}
		N--;
		return item;
	}
	public static void main(String[] args) {
		Test29<String> queue=new Test29<String>();
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue("d");
		queue.enqueue("e");
		queue.enqueue("f");
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.last.next.item);
			queue.last=queue.last.next;
		}
	}
}
