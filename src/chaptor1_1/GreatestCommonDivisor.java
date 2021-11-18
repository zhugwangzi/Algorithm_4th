package chaptor1_1;
import java.util.Scanner;
public class GreatestCommonDivisor {
	public static int gcd(int p,int q) {
		if(q==0) {
			return p;
		}
		return gcd(q,p%q);
	}
	public static void main(String[] args) {
		int p,q;
		Long startTime=System.currentTimeMillis();
		Scanner s=new Scanner(System.in);
		System.out.println("请输入p和q，用空格分开，回车结束");
		p=s.nextInt();
		q=s.nextInt();
		s.close();
		System.out.println(p+"和"+q+"的最大公约数是："
				+gcd(p,q));
		Long endTime=System.currentTimeMillis();
		System.out.println("程序运行的时间是"+
				(endTime-startTime)+"ms");
	}
}
