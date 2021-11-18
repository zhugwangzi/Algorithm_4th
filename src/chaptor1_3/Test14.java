package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test14{
	private int N;//ջ������ʼֵΪ1
	private String[] a=new String[1];
	public boolean isEmpty() {//�Ƿ�Ϊ�ռ�
		return N==0;
	}
	public int size() {//ջ������
		return N;
	}
	public void resize(int max) {//������������
		String[] t=new String[max];
		for(int i=0;i<N;i++) {
			t[i]=a[i];
		}
		a=t;
	}
	public void enqueue(String s) {//Ԫ������
		if(N==a.length) {//�ж�ջ�Ƿ��������˾�����Ϊ2��
			resize(2*a.length);
		}
		a[N++]=s;
	}
	public String dequeue() {//Ԫ�س���
		String t=a[0];//��ȡa[0]
		for(int i=0;i<N-1;i++) {//���ΰ�a[1],a[2],...,a[N-1]����Ųһλ
			a[i]=a[i+1];
		}
		a[--N]=null;//����a[N-1]����
		if(N>0&&N<=a.length/4) {//�ж�ɾ��Ԫ�غ�ջ�����Ƿ�̫С
			resize(a.length/2);//ջ̫С�����鳤�Ⱦͼ���
		}
		return t;
	}
	public static void main(String[] args) {
		Test14 s=new Test14();//����һ������
		System.out.println("�������ַ�����");
		String str=StdIn.readLine();
		String[] words=str.split(" ");
		System.out.print("������Ԫ���ǣ�");
		for(String x:words){
			if(x.equals("-")) {
				System.out.print(s.dequeue()+"   ");
			}else {
				s.enqueue(x);
			}
		}
		System.out.println("\nջ��ʣ�� "+s.size()+" ��Ԫ��");
		for(String x:s.a) {//ע������s.a����ջ
			System.out.print(x+"  ");
		}
	}
}
