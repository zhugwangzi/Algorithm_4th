package chaptor1_5;
import java.util.Arrays;
/*
֤����Ŀ��
������һ�ø߶�Ϊn(n>=1)������������ٵ���Ϊk(n),����h(k(n))=n��
��h(k(1))=1,h(k(2))=2,...�����н��ۢ�h(k(n))=h(k(n-1))+1;

����֤�����ۢڣ��Զ������������x1<x2,��h(x1)<h(x2).
������x1<x2ʹ��h(x1)=h(x2),������h(x2)�߶ȵ�������С������x1�������ⲻ����
������x1<x2ʹ��h(x1)>h(x2),����԰�h(x1)��ȥ�����ֵ��ʹ��ʣ��x3(x3<x1)
���㹹�ɵ���h(x3)=h(x2)��������h(x2)�߶ȵ�������С����x3<x2�������ⲻ����
��˽��ۢڳ�����

������k(n-1)������ɵ���ߵ����ϲ����߶Ȼ��1�������ۣۢ�h(k(n-1)+k(n-1))=h(2*k(n-1))=h(k(n-1))+1
�ɢ٢ۿ�֪h(2*k(n-1))=h(k(n))�����ɢڿɵ�k(n)=2*k(n-1)=4*k(n-2)=...=2^(n-1)*k(1).
��֪k(1)=2,��k(n)=2^n.��N=2^n,��n=logN��N�����γɵ����߶�h(N)=n=logN��֤�ϡ�
 */
public class Test14 {
	private int[] id;//i�Ǵ��㣬id[i]��ʾi�ĸ��ڵ�
	private int[] height;//��i�����ĸ߶�
	private int count;//������Ŀ
	public Test14(int N) {//��ʼ��N��������N�����㡢N����
		count=N;
		id=new int[N];
		height=new int[N];
		for(int i=0;i<N;i++) {height[i]=0;id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		while(p!=id[p]) {p=id[p];}
		return p;//���ڵ�
	}
	public void union(int p,int q) {
		int proot=find(p);//���ڵ�
		int qroot=find(q);
		if(proot==qroot) {return;}//p,q��ͬһ����������ͽ���
		if(height[proot]<height[qroot]) {//���ǰ�С�����ӵ�����
			id[proot]=qroot;//proot���ӵ�qroot
		}else {
			id[qroot]=proot;//qroot���ӵ�proot
			if(height[proot]==height[qroot]) {height[proot]+=1;}//proot���߶�+1
		}
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};
		Test14 t=new Test14(10);
		System.out.println("δ����Ĵ������飺	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.union(x[0],x[1]);
			System.out.println("���� "+Arrays.toString(x)+" ��Ĵ������飺"+
					Arrays.toString(t.id));
		}
		System.out.print("ÿ�������Ӧ�������߶ȣ�");
		for(int x: t.height){
			System.out.print(x+" ");
		}
	}
}
