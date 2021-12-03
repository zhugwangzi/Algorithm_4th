package chaptor1_2;
import java.util.Arrays;
import edu.princeton.cs.algs4.*;
public class Test09 {
	public static int rank(int key,int[] a,Counter c) {
		return rank(key,a,0,a.length-1,c);
	}
	public static int rank(int key,int[] a,int low,int high,Counter c) {
		if(low>high) {
			return -1;//�ݹ��������
		}
		int mid=(low+high)/2;
		c.increment();//�ݹ����
		if(key<a[mid]) {
			return rank(key, a, low, mid-1, c);//��ݹ����
		}else if(key>a[mid]) {
			return rank(key, a, low, mid-1, c);//�ҵݹ����
		}else {
			return mid;//�ҵ�key
		}
	}
	public static void main(String[] args) {
		System.out.println("���������鳤��N");
		int N=StdIn.readInt();
		int[] a=new int[N];
		System.out.println("������һ������,�ո�ֿ�,�س�����");
		for(int i=0;i<N;i++) {
			a[i]=StdIn.readInt();
		}
		Arrays.sort(a);
		System.out.println("����key");
		int key=StdIn.readInt();
		Counter c=new Counter("key");
		System.out.println("key��λ�ã�"+rank(key, a, c));
		System.out.println(c);
	}
}
