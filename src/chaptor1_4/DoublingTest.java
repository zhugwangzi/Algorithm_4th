package chaptor1_4;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.ThreeSum;

class StopWatch{
	private final long start;
	public StopWatch() {start=System.currentTimeMillis();}
	public double elapsedTime() {
		long now=System.currentTimeMillis();
		return (now-start)/1000.0;
	}
}
public class DoublingTest {
	public static double timeTrial(int N) {
		int max=100;
		int[] a=new int[N];
		for(int i=0;i<N;i++) {a[i]=StdRandom.uniform(-max,max);}
		StopWatch timer =new StopWatch();	
		int cnt=ThreeSum.count(a);
		return timer.elapsedTime();
	}
	public static void main(String[] args) {
		StdDraw.setXscale(0,1000);
		StdDraw.setYscale(0,10);
		StdDraw.setPenRadius(0.05);
		for(int N=250;N<=1000;N+=N){
			double time=timeTrial(N);
			StdDraw.point(N,time);
			StdDraw.point(Math.log(N),time);
			StdDraw.point(Math.log(N)/Math.log(2),3*Math.log(N)/Math.log(2));
		}
	}
}
