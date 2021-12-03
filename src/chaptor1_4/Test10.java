package chaptor1_4;
import java.util.Arrays;;
public class Test10 {
	public static int find(int[] a,int key) {
		Arrays.sort(a);
		if(a[0]==key) {return 0;}
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(key>a[mid]) {low=mid+1;}
			else if(key<a[mid]) {high=mid-1;}
			else {
				while(a[mid-1]==a[mid]){mid--;	}
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a= {6,-3};
		System.out.println(find(a, 6));
		System.out.println(Arrays.toString(a));
	}
}
