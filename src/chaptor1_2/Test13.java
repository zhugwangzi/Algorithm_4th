package chaptor1_2;
import edu.princeton.cs.algs4.*;
public class Test13 {
	String who;//客户名
	Date when;//交易日期
	double amount;//交易金额
	public Test13(String tran) {
		String[] s=tran.split(" ");
		who=s[0];
		when=new Date(s[1]);
		amount=Double.parseDouble(s[2]);
	}
	public Test13(String who,Date when,double amount) {
		this.who=who;
		this.when=when;
		this.amount=amount;
	}
	public String who() {
		return who;
	}
	public Date when() {
		return when;
	}
	public double amount() {
		return amount;
	}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		Test13 t=(Test13) o;//上面是false则不执行，是true则能强制转换成功
		if(this.who!=t.who) {
			return false;
		}
		if(this.when!=t.when) {
			return false;
		}
		if(this.amount!=t.amount) {
			return false;
		}
		return true;//以上全部true则返回true
	}
	public String toString() {
		return who+"  "+when+"  "+amount;
	}
	public static void main(String[] args) {
		Test13 t1=new Test13("tom 9/12/2019 20000.0");
		Test13 t2=new Test13("jack",new Date(8,21,2020),21000.0);
		System.out.println("客户名："+t1.who);
		System.out.println("交易日期："+t1.when);
		System.out.println("交易金额："+t1.amount);
		System.out.println("客户名："+t2.who);
		System.out.println("交易日期："+t2.when);
		System.out.println("交易金额："+t2.amount);
//		System.out.println(t1.toString());
	}
}
