package chaptor1_2;
import java.util.Arrays;
import edu.princeton.cs.algs4.*;
public class Test09 {
	public static int rank(int key,int[] a,Counter c) {
		return rank(key,a,0,a.length-1,c);
	}
	public static int rank(int key,int[] a,int low,int high,Counter c) {
		if(low>high) {
			return -1;//递归结束条件
		}
		int mid=(low+high)/2;
		c.increment();//递归次数
		if(key<a[mid]) {
			return rank(key, a, low, mid-1, c);//左递归查找
		}else if(key>a[mid]) {
			return rank(key, a, low, mid-1, c);//右递归查找
		}else {
			return mid;//找到key
		}
	}
	public static void main(String[] args) {
		System.out.println("请输入数组长度N");
		int N=StdIn.readInt();
		int[] a=new int[N];
		System.out.println("请输入一行数组,空格分开,回车结束");
		for(int i=0;i<N;i++) {
			a[i]=StdIn.readInt();
		}
		Arrays.sort(a);
		System.out.println("请输key");
		int key=StdIn.readInt();
		Counter c=new Counter("key");
		System.out.println("key的位置："+rank(key, a, c));
		System.out.println(c);
	}
}
