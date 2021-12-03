package chaptor1_3;
import java.util.Iterator;
public class LinklistStack <Item>{//用链表实现的栈
	private class Node{//链表内部类
		Node next;//next指针域
		Item item;//item数据域
	}
	private Node first;//表头或者说栈顶
	private int N;//链表或栈的容量
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public void push(Item i) {//向栈顶添加元素
		Node oldfirst =first;
		first=new Node();
		first.item=i;
		first.next=oldfirst;
		N++;
	}
	public Item pop() {//从栈顶删除元素并获取该元素
		Item i=first.item;
		first=first.next;
		N--;
		return i;
	}
}
