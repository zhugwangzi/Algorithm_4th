package chaptor1_5;
import java.util.Arrays;
public class Test01 {
	private int[] id;//分量数组，i是触点，id[i]表示i所在分量的名称
	private int count;//分量数目
	private int j;//访问数组次数
	public Test01(int N) {//初始化N个分量和N个触点
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++) {id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		j++;//访问一次数组
		return id[p];
	}
	public void union(int p,int q) {
		int pid=find(p);
		int qid=find(q);
		if(pid==qid) {return;}//p,q在同一个分量里面就结束
		for(int i=0;i<id.length;i++) {
			j++;//if语句访问一次数组
			if(id[i]==pid) {//把所有和p连通的触点，全部改成q所在的分量
				id[i]=qid;
				j++;//上一行访问一次数组
			}
		}
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};
		Test01 t=new Test01(10);
		System.out.println("未处理的触点数组：	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.j=0;
			t.union(x[0],x[1]);
			System.out.print("处理 "+Arrays.toString(x)+" 后的触点数组："+Arrays.toString(t.id));
			System.out.println("  访问数组次数："+t.j);
		}
	}
}
