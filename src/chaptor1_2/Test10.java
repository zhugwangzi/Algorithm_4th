package chaptor1_2;
import edu.princeton.cs.algs4.*;
class VisualCounter{
	int N,max,count;
	String name="counter";
	public VisualCounter(int N,int max) {
		this.N=N;
		this.max=max;
	}
	public void add() {
		count++;
	}
	public void minus() {
		count--;
	}
	public String toString() {
		return "["+name+" , "+count+"]";
	}
}
public class Test10 {
public static void main(String[] args) {
	StdOut.println("enter N and max:");
	int N=StdIn.readInt();
	int max=Math.abs(StdIn.readInt());
	StdDraw.setXscale(0,N);
	StdDraw.setYscale(-max,max);
	StdDraw.setPenRadius(0.005);
	VisualCounter v=new VisualCounter(N, max);
	for(int i=0;i<N;i++) {
		int n=StdRandom.uniform(0,2);
		if(1==n||v.count==-max) {
			v.add();
			StdDraw.point(i+1,v.count);
		}else if(0==n||v.count==max){
			v.minus();
			StdDraw.point(i+1,v.count);
		}
	}
}
}
