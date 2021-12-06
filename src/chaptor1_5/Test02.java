package chaptor1_5;
import java.util.Arrays;
public class Test02 {
	private int[] id;//i�Ǵ��㣬id[i]��ʾi�������ڵ�����ڴ���
	private int count;//������Ŀ
	private int j;//�����������
	public Test02(int N) {//��ʼ��N��������N������
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++) {id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		while(p!=id[p]) {
			p=id[p];
			j+=2;//����һ������
		}
		j++;//id[p]=pʱ������һ��
		return id[p];//���ڵ�
	}
	public void union(int p,int q) {
		int proot=find(p);//���ڵ�
		int qroot=find(q);
		if(proot==qroot) {return;}//p,q��ͬһ����������ͽ���
		id[proot]=qroot;//proot���ӵ�qroot
		j++;
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};
		Test02 t=new Test02(10);
		System.out.println("δ����Ĵ������飺	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.j=0;
			t.union(x[0],x[1]);
			System.out.print("���� "+Arrays.toString(x)+" ��Ĵ������飺"+Arrays.toString(t.id));
			System.out.println("  �������������"+t.j);
		}
	}
}
