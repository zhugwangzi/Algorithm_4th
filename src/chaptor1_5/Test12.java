package chaptor1_5;
import java.util.Arrays;
public class Test12 {
	private int[] id;//i�Ǵ��㣬id[i]��ʾi�������ڵ�����ڴ���
	private int count;//������Ŀ
	public Test12(int N) {//��ʼ��N��������N������
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++) {id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		int i=p;//ָ��i��p
		int next=id[i];//ָ��next��i�ĸ��ڵ�
		while(p!=id[p]) {p=id[p];	}//p����ʱp�Ǹ��ڵ�
		while(next!=p) {
			id[i]=p;//iָ���Ԫ�ء�p
			i=next;
			next=id[i];
		}
		return p;
	}
	public void union(int p,int q) {
		int proot=find(p);//���ڵ�
		int qroot=find(q);
		if(proot==qroot) {return;}//p,q��ͬһ����������ͽ���
		id[proot]=qroot;//proot���ӵ�qroot
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{1,2},{2,3},{3,4},{4,5}};
		Test12 t=new Test12(10);
		System.out.println("δ����Ĵ������飺	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.union(x[0],x[1]);
			System.out.println("���� "+Arrays.toString(x)+" ��Ĵ������飺"+Arrays.toString(t.id));
		}
	}
}
