package chaptor1_4;

public class Test18 {
	static int N;//查找次数
	public static int localMin(double[] a) {
		N=0;
		return find2(a, 0, a.length-1);//可以修改为find1
	}
	public static int find1(double[] a,int low,int high){
		//严格按照题意，局部最小值必须同时小于左右两个数，不包含端点
		N++;
		int mid=low+(high-low)/2;
		//找不到
		if(low>high||mid==0||mid==a.length-1) {return -1;}
		//找到了
		if(a[mid]<a[mid-1]&&a[mid]<a[mid+1]) {return mid;}
		int i=find1(a, low, mid-1);
		return i!=-1?i:find1(a, mid+1, high);
	}
	public static int find2(double[] a,int low,int high) {
		//只找局部最小值，遇到端点就取较小值
		N++;
		int mid=low+(high-low)/2;
		if(mid==a.length-1) {return a[mid]>a[mid-1]?mid-1:mid;}
		if(mid==0) {return a[mid]<a[mid+1]?mid:mid+1;}
		if(a[mid]<a[mid-1]&&a[mid]<a[mid+1]) {return mid;}
		if(a[mid-1]<a[mid+1]){return find2(a, low, mid-1);}
		else{return find2(a, mid+1, high);}
	}
	//循环解决
	public static int localMin2(int[] a){
		N=0;
		int low=0,high=a.length-1;
		while (low<=high){
			N++;
			int mid=low+(high-low)/2;
			if(mid>0&&a[mid]>a[mid-1]){high=mid-1;}
			else if(mid<a.length-1&&a[mid]>a[mid+1]){low=mid+1;}
			else {return mid;}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a1= {6,4};
		int[] a2= {1,3,2,4,0,5,6,8,7,9,-1};
		int[] a3= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("索引："+localMin2(a1)+"，查找次数："+N);
		System.out.println("索引："+localMin2(a2)+"，查找次数："+N);
		System.out.println("索引："+localMin2(a3)+"，查找次数："+N);
	}
}