package chaptor1_2;
import java.util.Scanner;
import edu.princeton.cs.algs4.*;
public class Test01 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入点数N");
		int N=s.nextInt();
		Point2D[] p=new Point2D[N];//创建含有N个点的数组
		
		for(int i=0;i<N;i++) {//生成N个单位正方形内的点
			p[i]=new Point2D(Math.random(),Math.random());
//			p[i].draw();画出单位正方形内的点
		}
		double minDistance=p[0].distanceTo(p[1]);
		for(int i=0;i<N;i++) {//计算任意两个点的距离
			for(int j=i+1;j<N;j++) {
				double d=p[i].distanceTo(p[j]);
				minDistance=(d<=minDistance)?d:minDistance;
			}
		}
		System.out.println("最短距离："+minDistance);
	}
}
