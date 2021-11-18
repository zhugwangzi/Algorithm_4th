package chaptor1_2;
import java.util.Scanner;
import edu.princeton.cs.algs4.*;
class NewInterval2D extends Interval2D{
	public Point2D p1;//左底点
	public Point2D p2;//右底点
	public Point2D p3;//右顶点
	public Point2D p4;//左顶点
	public NewInterval2D(Interval1D x,Interval1D y) {//2D间隔的构造方法
		super(x,y);
	}
	public boolean contain(NewInterval2D a) {//
		if(this.contains(a.p1)&&this.contains(a.p2)&&
				this.contains(a.p3)&&this.contains(a.p3)){
			return true;//2D间隔对象a的四个顶点都包含，则返回true
		}else {
			return false;
		}
	}
}
public class Test03 {
	public static void main(String[] args) {
		System.out.println("请输入N,min,max");
		Scanner s=new Scanner(System.in);
		int n=0;//相交间隔对的数量
		int m=0;//包含间隔对的数量
		int N=s.nextInt();
		double min=s.nextDouble();
		double max=s.nextDouble();
		NewInterval2D[] a=new NewInterval2D[N];
		for(int i=0;i<N;i++) {//创建N个2D间隔并画出它们
			double x1=StdRandom.uniform(min,max);
			double x2=StdRandom.uniform(x1,max);
			double y1=StdRandom.uniform(min,max);
			double y2=StdRandom.uniform(y1,max);
			Interval1D x=new Interval1D(x1, x2);
			Interval1D y=new Interval1D(y1, y2);
			a[i]=new NewInterval2D(x,y);
			a[i].p1=new Point2D(x1,y1);//左底点
			a[i].p2=new Point2D(x2,y1);//右底点
			a[i].p3=new Point2D(x2,y2);//右顶点
			a[i].p4=new Point2D(x1,y2);//左顶点
			a[i].draw();
		}
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {//a[i]依次和a[i+1]~a[N-1]比较
				if(a[i].intersects(a[j])) {
					n++;//计算相交的2D间隔对
					if(a[i].contain(a[j])||a[j].contain(a[i])) {
						m++;//若相交，则计算包含关系的间隔对
					}
				}
			}
		}
		System.out.println("相交的间隔对数量是："+n+"对");
		System.out.println("包含的间隔对数量是："+m+"对");
	}
}
