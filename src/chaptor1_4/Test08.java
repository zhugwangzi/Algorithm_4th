package chaptor1_4;
import java.util.Arrays;
public class Test08 {
	public static void intCouples1(int[] a) {
		int k=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {	k++;}
			}
		}
		System.out.println("整数对数量："+k);
	}
	
	public static void intCouples2(int[] a) {
		Arrays.sort(a);
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {k++;}
				else {break;}
			}
		}
		System.out.println("整数对的数量："+k);
	}
	public static void main(String[] args) {
		int[] a= {-3, -3, -1, -1, -1, 2, 4, 6, 6,0, 8, 9};
		intCouples2(a);
		System.out.println(Arrays.toString(a));
		
	}
}
