package chaptor1_3;
public class DGtest {
	public static void main(String[] args) {
//		System.out.println(sum(100));
		int[] a= {1,2,3,4,5,6,7,8,9};
		System.out.println(max(a, a[0], a[a.length-1]));
	}
	public static int max(int[] a,int low,int high) {
		if(low>=high) {
			return low;
		}
		int mid=(low+high)/2;
		int l=max(a, low, mid);
		int h=max(a, mid+1, high);
		return max(a, l, h);
	}
//	public static int sum(int n) {
//		if(n<2) {
//			return 1;
//		}
//		return n+sum(n-1);
//	}
}
