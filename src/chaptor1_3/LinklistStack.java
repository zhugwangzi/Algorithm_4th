package chaptor1_3;
import java.util.Iterator;
public class LinklistStack <Item>{//������ʵ�ֵ�ջ
	private class Node{//�����ڲ���
		Node next;//nextָ����
		Item item;//item������
	}
	private Node first;//��ͷ����˵ջ��
	private int N;//�����ջ������
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public void push(Item i) {//��ջ�����Ԫ��
		Node oldfirst =first;
		first=new Node();
		first.item=i;
		first.next=oldfirst;
		N++;
	}
	public Item pop() {//��ջ��ɾ��Ԫ�ز���ȡ��Ԫ��
		Item i=first.item;
		first=first.next;
		N--;
		return i;
	}
}
