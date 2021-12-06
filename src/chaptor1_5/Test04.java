package chaptor1_5;
import java.util.Arrays;
public class Test04 {
	private int[] id;//i是触点，id[i]表示i靠近根节点的相邻触点
	private int[] size;//第i棵树的大小
	private int count;//分量数目
	private int j;//访问id[]次数
	public Test04(int N) {//初始化N个分量、N个触点、N棵树
		count=N;
		id=new int[N];
		size=new int[N];
		for(int i=0;i<N;i++) {size[i]=1;id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		while(p!=id[p]) {
			p=id[p];
			j+=2;//访问一次id[]
		}
		j++;//id[p]=p时访问了一次id[]
		return p;//根节点
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
		j++;
		count--;
	}
	public static void main(String[] args) {
		int[][] a1= {{4,3},{3,8},{6,5},{9,4},{2,1},{8,9},{5,0},{7,2},{6,1},{1,0},{6,7}};//对照情况
		int[][] a2= {{0,1},{2,3},{4,5},{6,7},{0,2},{4,6},{0,4}};//最坏情况
		Test04 t=new Test04(10);
		System.out.println("未处理的id数组：	      "+Arrays.toString(t.id));
		System.out.println("未处理的size数组：	      "+Arrays.toString(t.size));
		for(int[] x:a1) {
			t.j=0;
			t.union(x[0],x[1]);
			System.out.println("\n处理 "+Arrays.toString(x)+" 后的id数组：   "+Arrays.toString(t.id));
			System.out.println("处理 "+Arrays.toString(x)+" 后的size数组："+Arrays.toString(t.size));
			System.out.println("访问id数组次数："+t.j);
		}
	}

}
