package chaptor1_5;
import java.util.Arrays;
public class Test13 {
	private int[] id;//i是触点，id[i]表示i的父节点
	private int[] size;//分量大小
	private int count;//分量数目
	public Test13(int N) {//初始化N个分量和N个触点
		count=N;
		id=new int[N];
		size=new int[N];
		for(int i=0;i<N;i++) {id[i]=i;size[i]=1;}
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
		if(size[proot]<size[qroot]) {//总是把小树链接到大树
			id[proot]=qroot;//proot链接到qroot
			size[qroot]+=size[proot];//qroot树变大
		}else {
			id[qroot]=proot;//qroot链接到proot
			size[proot]+=size[qroot];//proot树变大
		}
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{1,2},{4,3},{1,4},{8,7},{6,5},{6,8},{1,6},{10,9},{11,12},{11,10},{13,14},{15,0},{13,15},{11,13},{11,1}};
		Test13 t=new Test13(16);
		System.out.println("未处理的触点数组：	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.union(x[0],x[1]);
			System.out.println("处理 "+Arrays.toString(x)+" 后的触点数组："+Arrays.toString(t.id));
		}
	}
}
