package chaptor1_5;
import java.util.Arrays;
public class Test13 {
	private int[] id;//i�Ǵ��㣬id[i]��ʾi�ĸ��ڵ�
	private int[] size;//������С
	private int count;//������Ŀ
	public Test13(int N) {//��ʼ��N��������N������
		count=N;
		id=new int[N];
		size=new int[N];
		for(int i=0;i<N;i++) {id[i]=i;size[i]=1;}
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
		if(size[proot]<size[qroot]) {//���ǰ�С�����ӵ�����
			id[proot]=qroot;//proot���ӵ�qroot
			size[qroot]+=size[proot];//qroot�����
		}else {
			id[qroot]=proot;//qroot���ӵ�proot
			size[proot]+=size[qroot];//proot�����
		}
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{1,2},{4,3},{1,4},{8,7},{6,5},{6,8},{1,6},{10,9},{11,12},{11,10},{13,14},{15,0},{13,15},{11,13},{11,1}};
		Test13 t=new Test13(16);
		System.out.println("δ����Ĵ������飺	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.union(x[0],x[1]);
			System.out.println("���� "+Arrays.toString(x)+" ��Ĵ������飺"+Arrays.toString(t.id));
		}
	}
}
