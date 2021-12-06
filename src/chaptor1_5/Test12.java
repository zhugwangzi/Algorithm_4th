package chaptor1_5;
import java.util.Arrays;
public class Test12 {
	private int[] id;//i是触点，id[i]表示i靠近根节点的相邻触点
	private int count;//分量数目
	public Test12(int N) {//初始化N个分量和N个触点
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++) {id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		int i=p;//指针i→p
		int next=id[i];//指针next→i的父节点
		while(p!=id[p]) {p=id[p];	}//p结束时p是根节点
		while(next!=p) {
			id[i]=p;//i指向的元素→p
			i=next;
			next=id[i];
		}
		return p;
	}
	public void union(int p,int q) {
		int proot=find(p);//根节点
		int qroot=find(q);
		if(proot==qroot) {return;}//p,q在同一个分量里面就结束
		id[proot]=qroot;//proot链接到qroot
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{1,2},{2,3},{3,4},{4,5}};
		Test12 t=new Test12(10);
		System.out.println("未处理的触点数组：	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.union(x[0],x[1]);
			System.out.println("处理 "+Arrays.toString(x)+" 后的触点数组："+Arrays.toString(t.id));
		}
	}
}
