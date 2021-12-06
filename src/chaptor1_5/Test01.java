package chaptor1_5;
import java.util.Arrays;
public class Test01 {
	private int[] id;//�������飬i�Ǵ��㣬id[i]��ʾi���ڷ���������
	private int count;//������Ŀ
	private int j;//�����������
	public Test01(int N) {//��ʼ��N��������N������
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++) {id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		j++;//����һ������
		return id[p];
	}
	public void union(int p,int q) {
		int pid=find(p);
		int qid=find(q);
		if(pid==qid) {return;}//p,q��ͬһ����������ͽ���
		for(int i=0;i<id.length;i++) {
			j++;//if������һ������
			if(id[i]==pid) {//�����к�p��ͨ�Ĵ��㣬ȫ���ĳ�q���ڵķ���
				id[i]=qid;
				j++;//��һ�з���һ������
			}
		}
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};
		Test01 t=new Test01(10);
		System.out.println("δ����Ĵ������飺	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.j=0;
			t.union(x[0],x[1]);
			System.out.print("���� "+Arrays.toString(x)+" ��Ĵ������飺"+Arrays.toString(t.id));
			System.out.println("  �������������"+t.j);
		}
	}
}
