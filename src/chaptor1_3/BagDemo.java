package chaptor1_3;
import edu.princeton.cs.algs4.*;
import java.util.Scanner;
public class BagDemo {
	public static void main(String[] args) {
		double sum=0.0;//数据之和
		double e=0.0;//数据与均值之差的平方和
		double std=0.0;//标准差
		Scanner s=new Scanner(System.in);
		Bag<Double> bag=new<Double> Bag();
		StdOut.println("enter numbers, end with '.' :");
		while(s.hasNextDouble()){
			bag.add(s.nextDouble());
		}
		s.close();
		for(double x:bag) {
			sum+=x;
			StdOut.printf("%-7.2f",x);
		}
		int N=bag.size();
		double mean=sum/N;
		StdOut.println();
		for(double x:bag) {
			e+=(x-mean)*(x-mean);
			StdOut.printf("%-5.2f",x);
		}
		StdOut.println();
		std=Math.sqrt(e/(N-1));
		StdOut.printf("mean: %.2f%n",mean);
		StdOut.printf("std: %.2f",std);
	}

}
