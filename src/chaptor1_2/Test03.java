package chaptor1_2;
import java.util.Scanner;
import edu.princeton.cs.algs4.*;
class NewInterval2D extends Interval2D{
	public Point2D p1;//��׵�
	public Point2D p2;//�ҵ׵�
	public Point2D p3;//�Ҷ���
	public Point2D p4;//�󶥵�
	public NewInterval2D(Interval1D x,Interval1D y) {//2D����Ĺ��췽��
		super(x,y);
	}
	public boolean contain(NewInterval2D a) {//
		if(this.contains(a.p1)&&this.contains(a.p2)&&
				this.contains(a.p3)&&this.contains(a.p3)){
			return true;//2D�������a���ĸ����㶼�������򷵻�true
		}else {
			return false;
		}
	}
}
public class Test03 {
	public static void main(String[] args) {
		System.out.println("������N,min,max");
		Scanner s=new Scanner(System.in);
		int n=0;//�ཻ����Ե�����
		int m=0;//��������Ե�����
		int N=s.nextInt();
		double min=s.nextDouble();
		double max=s.nextDouble();
		NewInterval2D[] a=new NewInterval2D[N];
		for(int i=0;i<N;i++) {//����N��2D�������������
			double x1=StdRandom.uniform(min,max);
			double x2=StdRandom.uniform(x1,max);
			double y1=StdRandom.uniform(min,max);
			double y2=StdRandom.uniform(y1,max);
			Interval1D x=new Interval1D(x1, x2);
			Interval1D y=new Interval1D(y1, y2);
			a[i]=new NewInterval2D(x,y);
			a[i].p1=new Point2D(x1,y1);//��׵�
			a[i].p2=new Point2D(x2,y1);//�ҵ׵�
			a[i].p3=new Point2D(x2,y2);//�Ҷ���
			a[i].p4=new Point2D(x1,y2);//�󶥵�
			a[i].draw();
		}
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {//a[i]���κ�a[i+1]~a[N-1]�Ƚ�
				if(a[i].intersects(a[j])) {
					n++;//�����ཻ��2D�����
					if(a[i].contain(a[j])||a[j].contain(a[i])) {
						m++;//���ཻ������������ϵ�ļ����
					}
				}
			}
		}
		System.out.println("�ཻ�ļ���������ǣ�"+n+"��");
		System.out.println("�����ļ���������ǣ�"+m+"��");
	}
}
