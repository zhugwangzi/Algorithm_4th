package chaptor1_3;

public class Test0<Item> {
	public class Node{
		Node next;
		Item item;
	}
	private Node first;public static void main(String[] args) {
		Test0<String> t=new Test0<String>();
		System.out.println(t.first);
	}
}
