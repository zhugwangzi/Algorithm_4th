package chaptor1_2;
import edu.princeton.cs.algs4.*;
public class Test18 {
	private static double m;
	private static double s;
	private static int N;
	public static void addDataValue(double x) {
		N++;
		s=s+1.0*(N-1)/N*(x-m)*(x-m);
		m=m+(x-m)/N;
	}
	public static double mean() {
		return m;
	}
	public static double var() {
		return s/(N-1);
	}
	public static double stddev() {
		return Math.sqrt(var());
	}
	public static void main(String[] args) {
		double[] d= {1.2,3.1,3,2.5,2.9,3.5};
		double sum=0.0;
		double sum2=0.0;
		for(double x:d) {
			sum+=x;
			addDataValue(x);
		}
		System.out.println("均值= "+mean());
		System.out.println("方差= "+var());
		System.out.println("标准差= "+stddev());
		//按另一种方式计算
		double mean=sum/N;
		for(double x:d) {
			sum2+=(x-mean)*(x-mean);
		}
		double var=sum2/(N-1);
		double stddev=Math.sqrt(var);
		System.out.println("均值="+mean);
		System.out.println("方差="+var);
		System.out.println("标准差="+stddev);
	}
}
