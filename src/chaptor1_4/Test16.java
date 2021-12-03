package chaptor1_4;
import java.util.Arrays;
public class Test16 {
	public static double[] minDistance1(double[] a) {//平方级别
		int n=a.length;
		double m1=a[0],m2=a[1];
		double min=m1-m2>0?m1-m2:m2-m1;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				double distance=a[j]-a[i]>0?a[j]-a[i]:a[i]-a[j];
				if(distance<min) {
					min=distance;
					m1=a[i]>a[j]?a[j]:a[i];
					m2=a[i]>a[j]?a[i]:a[j];
				}
			}
		}
		return new double[]{m1,m2};
	}
	public static double[] minDistance2(double[] a) {//线性对数级别
		Arrays.sort(a);
		double min=a[1]-a[0];
		int index=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]-a[i]<min) {
				min=a[i+1]-a[i];
				index=i;
			}
		}
		return new double[] {a[index],a[index+1]};
	}
	
	public static void main(String[] args) {
		double[] a= {-0.1,-1.3,5,2.1,3,2,-6.2,7.2};
		System.out.println(Arrays.toString(minDistance1(a)));
		System.out.println(Arrays.toString(minDistance2(a)));
	}
}
