package chaptor1_5;
import java.util.Arrays;
public class Test03 {
	private int[] id;//i�Ǵ��㣬id[i]��ʾi�������ڵ�����ڴ���
	private int[] size;//��i�����Ĵ�С
	private int count;//������Ŀ
	private int j;//����id[]����
	public Test03(int N) {//��ʼ��N��������N�����㡢N����
		count=N;
		id=new int[N];
		size=new int[N];
		for(int i=0;i<N;i++) {size[i]=1;id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		while(p!=id[p]) {
			p=id[p];
			j+=2;//����һ��id[]
		}
		j++;//id[p]=pʱ������һ��id[]
		return p;//���ڵ�
	}
	public void union(int p,int q) {
		int proot=find(p);//���ڵ�
		int qroot=find(q);
		if(proot==qroot) {return;}//p,q��ͬһ����������ͽ���
		if(size[proot]<size[qroot]) {//���ǰ�С�����ӵ�����
			id[proot]=qroot;//proot���ӵ�qroot
			size[qroot]+=size[proot];//qroot�����
		}else {
			id[qroot]=proot;//qroot���ӵ�proot
			size[proot]+=size[qroot];//proot�����
		}
		j++;
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};
		Test03 t=new Test03(10);
		System.out.println("δ����Ĵ������飺	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.j=0;
			t.union(x[0],x[1]);
			System.out.print("���� "+Arrays.toString(x)+" ��Ĵ������飺"+Arrays.toString(t.id));
			System.out.println("  �������������"+t.j);
		}
	}

}
