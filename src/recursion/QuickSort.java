package recursion;
import java.util.*;
public class QuickSort {
	public static void swap(int x,int y) {
		int t=x;
		x=y;
		y=t;
	}
	public static void quickSort(int[] a,int x,int y) {//定义快速排序方法
		if(y==x&&x<y) {//基准条件
			return;
		}
		int pivot=a[x];//基准值
		int j=0;//较小数组的下标
		for(int i=x+1;i<=y;i++) {//小数放在左边
			if(a[i]<pivot) {
				swap(a[i],a[x+j]);
				j++;
			}
		}//循环结束后较小数组有j个元素
		swap(pivot,a[x+j]);//把基准值和a[x+j]交换
		//此时数组分成三部分：a[x]~a[x+j-1],a[x+j],a[x+j]~a[y]
		quickSort(a,x,x+j-1);
		quickSort(a,x+j,y);
	}
	public static void main(String[] args) {
		int a[]= {8,7,6,5,4,3,2,1};
		quickSort(a,0,7);
		System.out.println("快速排序后：");
		for(int i=0;i<a.length;i++) {
			System.out.print(a+" ");
		}
	}
}
