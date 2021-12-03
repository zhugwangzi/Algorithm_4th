package chaptor1_3;
public class Test28<Item>{
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
	public int max(Node x) {//����x��ʵ�ò���
		return getMax(first,(int)first.item);//����getMax(Node x,int max)����
	}
	public int getMax(Node x,int max) {//�ݹ�ʱx��max��һֱ�仯
		if(x==null) {//������������x��β�����null�������
			return max;
		}
		if((int)x.item>max) {//��֤maxʼ��Ϊ���ֵ
			max=(int)x.item;
		}
		return getMax(x.next, max);//�������ɣ�������㣬max��
	}
	public static void main(String[] args) {
		Test28<Integer> t=new Test28<Integer>();
		t.add(1);
		t.add(3);
		t.add(4);
		t.add(8);
		t.add(12);
		t.add(2);
		t.add(32);
		t.add(23);
		System.out.println(t.max(t.first));
	}
}
