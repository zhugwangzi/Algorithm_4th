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
	public void add(Item item) {//Ïò±íÎ²Ìí¼Ó½áµã
		if(N==0) {
			first=createNode(item);
		}else {
			Node x;//Ö¸Õë½áµã
			Node t=createNode(item);//´´½¨½áµãt
			for(x=first;x.next!=null;x=x.next);//xÖ¸ÏòÎ²½áµã
			x.next=t;//Ìí¼Ótµ½xºóÃæ
		}
		N++;
	}
	public Node reverse1(Node x) {//·½·¨1£ºÒÀ´Î¸´ÖÆ½áµãµ½ĞÂÁ´±í
		if(N<2) {
			return first;
		}
		Node reverse=createNode(first.item);//ĞÂÁ´±íµÄÊ×½áµã
		for(x=first.next;x!=null;x=x.next) {//´ÓµÚ2¸ö½áµã¿ªÊ¼±éÀú
			Node t=createNode(x.item);//¸´ÖÆµ±Ç°½áµãµ½t
			t.next=reverse;//Ìí¼Ótµ½reverseÇ°Ãæ
			reverse=t;//ÖØÃüÃûtÎªreverse
		}
		first=reverse;//ÖØÃüÃûreverseÎªfirst
		return first;
	}
	public Node reverse2(Node x) {//·½·¨2£ºÒÀ´Î·­×ª ¡ú Îª ¡û
		if(N<2) {
			return first; 
		}
		Node left=first;//°Ñfirst¢Ù±ä³Éleft¢Ù¡úfirst¢Ú¡úright¢Û
		first=first.next;
		Node right=first.next;
		left.next=null;//null¡ûleft¢Ù¡ûfirst¢Ú  right¢Û
		first.next=left;
		while(right!=null) {
			left=first;//left,first,rightÍùÓÒÒÆ
			first=right;
			right=first.next;
			first.next=left;//left  first¡úright±ä³Éleft¡ûfirst  right
		}
		return first;
	}
	public Node reverse2_1(Node x) {//·½·¨2ÓÅ»¯°æ
		Node reverse =null;
		Node second;
		for(;first!=null;first=second) {//Ö¸Õëfirst±éÀúÃ¿¸ö½áµã
			second=first.next;
			first.next=reverse;//°Ñreverse   first¡úsecond±ä³Éreverse¡ûfirst   second
			reverse=first;//Ö¸Õëreverse,first,secondÓÒÒÆ
		}
		first=reverse;//½áÊøÊ±reverseÊÇÎ²½áµã
		return first;
	}
	public Node reverse3(Node x) {//µİ¹é·­×ªx½áµãºóÃæµÄÕûÌõÁ´±í£¬·µ»Ø·­×ªÁ´±íµÄÊ×½áµã
		if(x==null||x.next==null) {//ÈôxÊÇÎ²½áµã»ònullÔò·µ»Øx
			return x;
		}
		Node second=x.next;//x¡úsecond¡ú...¡únull
		Node rest=reverse3(second);//·­×ªsecond½áµãºóÃæµÄÕûÌõÁ´±í£¬·µ»Ø·­×ªÁ´±íµÄÊ×½áµã
		second.next=x;//°Ñx¡úsecond¡ú...±ä³Éx¡ûsecond
		x.next=null;//null¡ûx
		return rest;//µİ¹é½áÊøºó·µ»ØÊ×½áµã£¬first²»ÔÙÊÇÊ×½áµã
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
	public void add(Item item) {//å‘è¡¨å°¾æ·»åŠ ç»“ç‚¹
		if(N==0) {
			first=createNode(item);
		}else {
			Node x;//æŒ‡é’ˆç»“ç‚¹
			Node t=createNode(item);//åˆ›å»ºç»“ç‚¹t
			for(x=first;x.next!=null;x=x.next);//xæŒ‡å‘å°¾ç»“ç‚¹
			x.next=t;//æ·»åŠ tåˆ°xåé¢
		}
		N++;
	}
	public Node reverse1(Node x) {//æ–¹æ³•1ï¼šä¾æ¬¡å¤åˆ¶ç»“ç‚¹åˆ°æ–°é“¾è¡¨
		if(N<2) {
			return first;
		}
		Node reverse=createNode(first.item);//æ–°é“¾è¡¨çš„é¦–ç»“ç‚¹
		for(x=first.next;x!=null;x=x.next) {//ä»ç¬¬2ä¸ªç»“ç‚¹å¼€å§‹éå†
			Node t=createNode(x.item);//å¤åˆ¶å½“å‰ç»“ç‚¹åˆ°t
			t.next=reverse;//æ·»åŠ tåˆ°reverseå‰é¢
			reverse=t;//é‡å‘½åtä¸ºreverse
		}
		first=reverse;//é‡å‘½åreverseä¸ºfirst
		return first;
	}
	public Node reverse2(Node x) {//æ–¹æ³•2ï¼šä¾æ¬¡ç¿»è½¬ â†’ ä¸º â†
		if(N<2) {
			return first; 
		}
		Node left=first;//æŠŠfirstâ‘ å˜æˆleftâ‘ â†’firstâ‘¡â†’rightâ‘¢
		first=first.next;
		Node right=first.next;
		left.next=null;//nullâ†leftâ‘ â†firstâ‘¡  rightâ‘¢
		first.next=left;
		while(right!=null) {
			left=first;//left,first,rightå¾€å³ç§»
			first=right;
			right=first.next;
			first.next=left;//left  firstâ†’rightå˜æˆleftâ†first  right
		}
		return first;
	}
	public Node reverse2_1(Node x) {//æ–¹æ³•2ä¼˜åŒ–ç‰ˆ
		Node reverse =null;
		Node second;
		for(;first!=null;first=second) {//æŒ‡é’ˆfirstéå†æ¯ä¸ªç»“ç‚¹
			second=first.next;
			first.next=reverse;//æŠŠreverse   firstâ†’secondå˜æˆreverseâ†first   second
			reverse=first;//æŒ‡é’ˆreverse,first,secondå³ç§»
		}
		first=reverse;//ç»“æŸæ—¶reverseæ˜¯å°¾ç»“ç‚¹
		return first;
	}
	public Node reverse3(Node x) {//é€’å½’ç¿»è½¬xç»“ç‚¹åé¢çš„æ•´æ¡é“¾è¡¨ï¼Œè¿”å›ç¿»è½¬é“¾è¡¨çš„é¦–ç»“ç‚¹
		if(x==null||x.next==null) {//è‹¥xæ˜¯å°¾ç»“ç‚¹æˆ–nullåˆ™è¿”å›x
			return x;
		}
		Node second=x.next;//xâ†’secondâ†’...â†’nullï¼Œé€’å½’ä¸€æ¬¡æŒ‡é’ˆxå’Œsecondå°±å³ç§»ä¸€æ¬¡
		Node rest=reverse3(second);//ç¿»è½¬secondç»“ç‚¹åé¢çš„æ•´æ¡é“¾è¡¨ï¼Œè¿”å›ç¿»è½¬é“¾è¡¨çš„é¦–ç»“ç‚¹
		second.next=x;//æŠŠxâ†’secondâ†’...å˜æˆxâ†second
		x.next=null;//nullâ†x
		return rest;//é€’å»è¿‡ç¨‹é¦–ç»“ç‚¹restä¸€ç›´æ”¹å˜ï¼Œå½’æ¥è¿‡ç¨‹ä¸å˜ï¼Œä¸”firstä¸å†æ˜¯é¦–ç»“ç‚¹
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
