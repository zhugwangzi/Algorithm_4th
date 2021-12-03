package chaptor1_4;
import java.util.Arrays;
public class Test14 {
	//a[]没有相同元素
	public int count4(int[] a) {
		Arrays.sort(a);
		int n=a.length,count=0;
		for(int i=0;a[i]<0;i++) {//a[i]若>=0则一定找不到4个数之和为0
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					int index=find(a,k+1,n-1,-a[i]-a[j]-a[k]);//在[k+1,n-1]区间上查找
					if(index>k){
						count++;
						System.out.println("["+a[i]+","+a[j]+","+a[k]+","+a[index]+"]");
					}
				}
			}
		}
		return count;
	}
	public int find(int[] a,int i,int j,int key){
		int low=i;
		int high=j;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(key>a[mid]) {low=mid+1;}
			else if(key<a[mid]) {high=mid-1;}
			else {return mid;}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a1= {5, 2, -2, -5, 0,7};
		int[] a2= {1, 2, 3, 4, -4, -5, -6, 2,-1};
		Test14 t=new Test14();
		System.out.println(t.count4(a2));
//		System.out.println(t.count4(a2));
	}
}
