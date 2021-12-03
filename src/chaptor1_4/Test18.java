package chaptor1_4;

public class Test18 {
	static int N;
	public static int localMin(double[] a) {
		N=0;
		return find(a, 0, a.length-1);
	}
	public static int find(double[] a,int low,int high) {//递归
		N++;
		
		
		int mid=low+(high-low)/2;
		if(low>high||mid==0||mid==a.length-1) {return -1;}//找不到
		if(a[mid]<a[mid-1]&&a[mid]<a[mid+1]) {return mid;}
		int i=find(a, low, mid-1);
		return i!=-1?i:find(a, mid+1, high);
	}
	public static void main(String[] args) {
		double[] a1= {6,7,8,9,10};
		double[] a2= {1,3,2,4,0,5,6,8,7,9,-1};
		double[] a3= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("索引："+localMin(a1)+"，递归次数："+N);
		System.out.println("索引："+localMin(a2)+"，递归次数："+N);
		System.out.println("索引："+localMin(a3)+"，递归次数："+N);
	}
}