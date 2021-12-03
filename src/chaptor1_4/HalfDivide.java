package chaptor1_4;
import java.util.Arrays;
public class HalfDivide {
	public static int find1(int[] a,int key) {//循环实现二分法
		Arrays.sort(a);//数组必须排序好
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(key<a[mid]) {high=mid-1;}
			else if(key>a[mid]) {low=mid+1;}
			else {return mid;}
		}
		return -1;
	}
	
	public static int find2(int[] a,int key) {//递归"二分法“实现
		return findKey2(a, key,0,a.length-1);//数组元素顺序不变
	}
	public static int findKey2(int[] a,int key,int low,int high) {
		if(high==low&&a[low]!=key) {return -1;}//没找到
		if(low==high&&a[low]==key) {return low;}//找到了
		int mid=low+(high-low)/2;
		int index=findKey2(a, key, mid+1, high);
		return index==-1?findKey2(a, key, low, mid):index;
	}
	
	public static int find3(int[] a,int key) {//递归”去头法“实现
		return findKey3(a,key,0,a.length-1);//数组保持原顺序
	}
	public static int findKey3(int[] a,int key,int low,int high) {
		if(low>high) {return -1;}
		return a[low]==key?low:findKey3(a, key, low+1, high);
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,-3,9,8,7,6,9};
		int key=-4;
//		System.out.println(find1(a, key));
		System.out.println(find2(a, key));
	}

}
