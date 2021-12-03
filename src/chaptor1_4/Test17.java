package chaptor1_4;
import java.util.Arrays;
public class Test17 {
	public static double[] maxDistance(double[] a) {
		double max=a[0],min=a[0];
		for(double x:a) {
			if(x>max) {max=x;}
			if(x<min) {min=x;}
		}
		return new double[] {min,max};
	}
	public static void main(String[] args) {
		double[] a1= {1, 2, 3, 4, -4, -5, -6, 2, 4, -1};
		double[] a2= {-5.2, 9.4, 20, -10, 21.1, 40, 50, -20};
		System.out.println(Arrays.toString(maxDistance(a1)));
		System.out.println(Arrays.toString(maxDistance(a2)));
	}

}
