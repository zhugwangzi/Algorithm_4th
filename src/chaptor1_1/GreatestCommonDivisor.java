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
		System.out.println("������p��q���ÿո�ֿ����س�����");
		p=s.nextInt();
		q=s.nextInt();
		s.close();
		System.out.println(p+"��"+q+"�����Լ���ǣ�"
				+gcd(p,q));
		Long endTime=System.currentTimeMillis();
		System.out.println("�������е�ʱ����"+
				(endTime-startTime)+"ms");
	}
}
