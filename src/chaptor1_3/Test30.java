<<<<<<< HEAD
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
	public void add(Item item) {//向表尾添加结点
		if(N==0) {
			first=createNode(item);
		}else {
			Node x;//指针结点
			Node t=createNode(item);//创建结点t
			for(x=first;x.next!=null;x=x.next);//x指向尾结点
			x.next=t;//添加t到x后面
		}
		N++;
	}
	public Node reverse1(Node x) {//方法1：依次复制结点到新链表
		if(N<2) {
			return first;
		}
		Node reverse=createNode(first.item);//新链表的首结点
		for(x=first.next;x!=null;x=x.next) {//从第2个结点开始遍历
			Node t=createNode(x.item);//复制当前结点到t
			t.next=reverse;//添加t到reverse前面
			reverse=t;//重命名t为reverse
		}
		first=reverse;//重命名reverse为first
		return first;
	}
	public Node reverse2(Node x) {//方法2：依次翻转 → 为 ←
		if(N<2) {
			return first; 
		}
		Node left=first;//把first①变成left①→first②→right③
		first=first.next;
		Node right=first.next;
		left.next=null;//null←left①←first②  right③
		first.next=left;
		while(right!=null) {
			left=first;//left,first,right往右移
			first=right;
			right=first.next;
			first.next=left;//left  first→right变成left←first  right
		}
		return first;
	}
	public Node reverse2_1(Node x) {//方法2优化版
		Node reverse =null;
		Node second;
		for(;first!=null;first=second) {//指针first遍历每个结点
			second=first.next;
			first.next=reverse;//把reverse   first→second变成reverse←first   second
			reverse=first;//指针reverse,first,second右移
		}
		first=reverse;//结束时reverse是尾结点
		return first;
	}
	public Node reverse3(Node x) {//递归翻转x结点后面的整条链表，返回翻转链表的首结点
		if(x==null||x.next==null) {//若x是尾结点或null则返回x
			return x;
		}
		Node second=x.next;//x→second→...→null
		Node rest=reverse3(second);//翻转second结点后面的整条链表，返回翻转链表的首结点
		second.next=x;//把x→second→...变成x←second
		x.next=null;//null←x
		return rest;//递归结束后返回首结点，first不再是首结点
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
=======
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
	public void add(Item item) {//鍚戣〃灏炬坊鍔犵粨鐐�
		if(N==0) {
			first=createNode(item);
		}else {
			Node x;//鎸囬拡缁撶偣
			Node t=createNode(item);//鍒涘缓缁撶偣t
			for(x=first;x.next!=null;x=x.next);//x鎸囧悜灏剧粨鐐�
			x.next=t;//娣诲姞t鍒皒鍚庨潰
		}
		N++;
	}
	public Node reverse1(Node x) {//鏂规硶1锛氫緷娆″鍒剁粨鐐瑰埌鏂伴摼琛�
		if(N<2) {
			return first;
		}
		Node reverse=createNode(first.item);//鏂伴摼琛ㄧ殑棣栫粨鐐�
		for(x=first.next;x!=null;x=x.next) {//浠庣2涓粨鐐瑰紑濮嬮亶鍘�
			Node t=createNode(x.item);//澶嶅埗褰撳墠缁撶偣鍒皌
			t.next=reverse;//娣诲姞t鍒皉everse鍓嶉潰
			reverse=t;//閲嶅懡鍚峵涓簉everse
		}
		first=reverse;//閲嶅懡鍚峳everse涓篺irst
		return first;
	}
	public Node reverse2(Node x) {//鏂规硶2锛氫緷娆＄炕杞� 鈫� 涓� 鈫�
		if(N<2) {
			return first; 
		}
		Node left=first;//鎶奻irst鈶犲彉鎴恖eft鈶犫啋first鈶♀啋right鈶�
		first=first.next;
		Node right=first.next;
		left.next=null;//null鈫恖eft鈶犫啇first鈶�  right鈶�
		first.next=left;
		while(right!=null) {
			left=first;//left,first,right寰�鍙崇Щ
			first=right;
			right=first.next;
			first.next=left;//left  first鈫抮ight鍙樻垚left鈫恌irst  right
		}
		return first;
	}
	public Node reverse2_1(Node x) {//鏂规硶2浼樺寲鐗�
		Node reverse =null;
		Node second;
		for(;first!=null;first=second) {//鎸囬拡first閬嶅巻姣忎釜缁撶偣
			second=first.next;
			first.next=reverse;//鎶妑everse   first鈫抯econd鍙樻垚reverse鈫恌irst   second
			reverse=first;//鎸囬拡reverse,first,second鍙崇Щ
		}
		first=reverse;//缁撴潫鏃秗everse鏄熬缁撶偣
		return first;
	}
	public Node reverse3(Node x) {//閫掑綊缈昏浆x缁撶偣鍚庨潰鐨勬暣鏉￠摼琛紝杩斿洖缈昏浆閾捐〃鐨勯缁撶偣
		if(x==null||x.next==null) {//鑻鏄熬缁撶偣鎴杗ull鍒欒繑鍥瀤
			return x;
		}
		Node second=x.next;//x鈫抯econd鈫�...鈫抧ull锛岄�掑綊涓�娆℃寚閽坸鍜宻econd灏卞彸绉讳竴娆�
		Node rest=reverse3(second);//缈昏浆second缁撶偣鍚庨潰鐨勬暣鏉￠摼琛紝杩斿洖缈昏浆閾捐〃鐨勯缁撶偣
		second.next=x;//鎶妜鈫抯econd鈫�...鍙樻垚x鈫恠econd
		x.next=null;//null鈫恱
		return rest;//閫掑幓杩囩▼棣栫粨鐐箁est涓�鐩存敼鍙橈紝褰掓潵杩囩▼涓嶅彉锛屼笖first涓嶅啀鏄缁撶偣
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
>>>>>>> 202976f3c5e3b649e616edd6dc61ecc7070802cb
