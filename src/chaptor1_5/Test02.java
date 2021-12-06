package chaptor1_5;
import java.util.Arrays;
public class Test02 {
	private int[] id;//i是触点，id[i]表示i靠近根节点的相邻触点
	private int count;//分量数目
	private int j;//访问数组次数
	public Test02(int N) {//初始化N个分量和N个触点
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++) {id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		while(p!=id[p]) {
			p=id[p];
			j+=2;//访问一次数组
		}
		j++;//id[p]=p时访问了一次
		return id[p];//根节点
	}
	public void union(int p,int q) {
		int proot=find(p);//根节点
		int qroot=find(q);
		if(proot==qroot) {return;}//p,q在同一个分量里面就结束
		id[proot]=qroot;//proot链接到qroot
		j++;
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};
		Test02 t=new Test02(10);
		System.out.println("未处理的触点数组：	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.j=0;
			t.union(x[0],x[1]);
			System.out.print("处理 "+Arrays.toString(x)+" 后的触点数组："+Arrays.toString(t.id));
			System.out.println("  访问数组次数："+t.j);
		}
	}
}
