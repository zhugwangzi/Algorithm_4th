package chaptor1_5;
import java.util.Arrays;
public class Test11 {
	private int[] id;//触点所在的分量名
	private int[] size;//分量大小，size[i]表示i所在分量的大小
	private int count;//分量数量
	public Test11(int N) {//初始化触点、id[]和size[]
		count=N;
		id=new int[N];
		size=new int[N];
		for(int i=0;i<N;i++) {
			id[i]=i;
			size[i]=1;
		}
	}
	public int find(int p) {return id[p];}
	public void union(int p,int q) {
		int pid=find(p);
		int qid=find(q);
		if(pid==qid) {return;}
		if(size[pid]<size[qid]) {
			for(int i=0;i<id.length;i++) {
				if(id[i]==pid) {id[i]=qid;}
			}
			size[qid]+=size[pid];
		}else {
			for(int i=0;i<id.length;i++) {
				if(id[i]==qid) {id[i]=pid;}
			}
			size[pid]+=size[qid];
		}
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};
		Test11 t=new Test11(10);
		System.out.println("未处理的触点数组：	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.union(x[0],x[1]);
			System.out.println("处理 "+Arrays.toString(x)+" 后的触点数组："+Arrays.toString(t.id));
		}
	}
}
