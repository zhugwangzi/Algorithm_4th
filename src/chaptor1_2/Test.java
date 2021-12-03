package chaptor1_2;
import edu.princeton.cs.algs4.*;
class Accumulator{
	private double total;
	private int n;
	public Accumulator(int N,double value) {
		StdDraw.setXscale(0,N);
		StdDraw.setYscale(0,value);
		StdDraw.setPenRadius(0.01);
	}
	
	public void addPoint(double value) {
		n++;
		total+=value;
		StdDraw.setPenColor(StdDraw.DARK_GRAY);//设置数据点颜色
		StdDraw.point(n,value);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.point(n,total/n);
	}
}
public class Test{
	public static void main(String[] args) {
		int N=1000;//20个点
		Accumulator a=new Accumulator(N, 1.0);
		for(int i=0;i<N;i++) {
			a.addPoint(StdRandom.random());
		}
		System.out.println(a);
	}
}
