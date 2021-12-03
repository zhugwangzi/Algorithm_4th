package chaptor1_3;
public class Test30<Item> {
	public class Node{
		Node next;
		Item item;
	}
	private int N;
	private Node first;
	public Node createNode(Item item){
		Node t=new Node();
		t.item=item;
		return t;
	}
	public void add(Item item) {//���β��ӽ��
		if(N==0) {
			first=createNode(item);
		}else {
			Node x;//ָ����
			Node t=createNode(item);//�������t
			for(x=first;x.next!=null;x=x.next);//xָ��β���
			x.next=t;//���t��x����
		}
		N++;
	}
	public Node reverse1(Node x) {//����1�����θ��ƽ�㵽������
		if(N<2) {
			return first;
		}
		Node reverse=createNode(first.item);//��������׽��
		for(x=first.next;x!=null;x=x.next) {//�ӵ�2����㿪ʼ����
			Node t=createNode(x.item);//���Ƶ�ǰ��㵽t
			t.next=reverse;//���t��reverseǰ��
			reverse=t;//������tΪreverse
		}
		first=reverse;//������reverseΪfirst
		return first;
	}
	public Node reverse2(Node x) {//����2�����η�ת �� Ϊ ��
		if(N<2) {
			return first; 
		}
		Node left=first;//��first�ٱ��left�١�first�ڡ�right��
		first=first.next;
		Node right=first.next;
		left.next=null;//null��left�١�first��  right��
		first.next=left;
		while(right!=null) {
			left=first;//left,first,right������
			first=right;
			right=first.next;
			first.next=left;//left  first��right���left��first  right
		}
		return first;
	}
	public Node reverse2_1(Node x) {//����2�Ż���
		Node reverse =null;
		Node second;
		for(;first!=null;first=second) {//ָ��first����ÿ�����
			second=first.next;
			first.next=reverse;//��reverse   first��second���reverse��first   second
			reverse=first;//ָ��reverse,first,second����
		}
		first=reverse;//����ʱreverse��β���
		return first;
	}
	public Node reverse3(Node x) {//�ݹ鷭תx������������������ط�ת������׽��
		if(x==null||x.next==null) {//��x��β����null�򷵻�x
			return x;
		}
		Node second=x.next;//x��second��...��null
		Node rest=reverse3(second);//��תsecond������������������ط�ת������׽��
		second.next=x;//��x��second��...���x��second
		x.next=null;//null��x
		return rest;//�ݹ�����󷵻��׽�㣬first�������׽��
	}
	public static void main(String[] args) {
		Test30<String> t=new Test30<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		t.add("f");
		t.add("g");
		Test30<String>.Node x=t.reverse3(t.first);
		for(;x!=null;x=x.next) {
			System.out.println(x.item);
		}
	}
}
