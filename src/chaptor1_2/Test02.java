package chaptor1_2;
import edu.princeton.cs.algs4.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("«Î ‰»ÎN");
		int N=s.nextInt();
		double x,y;
	
		
		Interval1D[] a=new Interval1D[N];
		for(int i=0;i<N;i++) {
			x=Math.random();
			y=Math.random();
			if(x<y) {
				a[i]=new Interval1D(x,y);
			}else {
				a[i]=new Interval1D(y,x);
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(a[i].intersects(a[j])) {
					System.out.println(a[i]+"~"+a[j]);
				}
			}
		}
	}
}
