package chaptor1_4;

public class Test20 {
	static int max;//最大值的索引
	public static int max(int[] a) {//寻找最大值索引
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(mid==0) {mid+=1;}
			else if(mid==a.length-1) {mid=a.length-2;}
			
			if(a[mid]>a[mid-1]&&a[mid]<a[mid+1]) {low=mid+1;}//升序区间
			else if(a[mid]<a[mid-1]&&a[mid]>a[mid+1]) {high=mid-1;}//降序区间
			else {max=mid;break;}
		}
		return max;
	}
	public static int findLeft(int[] a,int key) {//升序区间二分查找
		int low=0,high=max;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(key>a[mid]) {low=mid+1;}
			else if(key<a[mid]) {high=mid-1;}
			else {return mid;}
		}
		return -1;
	}
	public static int findRight(int[] a,int key) {//降序区间二分查找
		int low=max,high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(key<a[mid]) {low=mid+1;}
			else if(key>a[mid]) {high=mid-1;}
			else {return mid;}
		}
		return -1;
	}
	public static int find(int[] a,int key) {//最坏情况比较次数小于3lg(N)
		int i=findLeft(a, key);
		return i==-1?findRight(a, key):i;
	}
	public static void main(String[] args) {
		int[] a1= {1,2,3,4,-1};
//		int[] a2= {1,2,3,5,9,8,7,6,4};
		max(a1);
		int key=-4;
		System.out.println(find(a1, key));
	}
}
