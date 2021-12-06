package chaptor1_5;
import java.util.Arrays;
public class Test04 {
	private int[] id;//i�Ǵ��㣬id[i]��ʾi�������ڵ�����ڴ���
	private int[] size;//��i�����Ĵ�С
	private int count;//������Ŀ
	private int j;//����id[]����
	public Test04(int N) {//��ʼ��N��������N�����㡢N����
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
		int[][] a1= {{4,3},{3,8},{6,5},{9,4},{2,1},{8,9},{5,0},{7,2},{6,1},{1,0},{6,7}};//�������
		int[][] a2= {{0,1},{2,3},{4,5},{6,7},{0,2},{4,6},{0,4}};//����
		Test04 t=new Test04(10);
		System.out.println("δ�����id���飺	      "+Arrays.toString(t.id));
		System.out.println("δ�����size���飺	      "+Arrays.toString(t.size));
		for(int[] x:a1) {
			t.j=0;
			t.union(x[0],x[1]);
			System.out.println("\n���� "+Arrays.toString(x)+" ���id���飺   "+Arrays.toString(t.id));
			System.out.println("���� "+Arrays.toString(x)+" ���size���飺"+Arrays.toString(t.size));
			System.out.println("����id���������"+t.j);
		}
	}

}
