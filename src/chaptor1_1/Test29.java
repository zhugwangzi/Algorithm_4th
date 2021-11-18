package chaptor1_1;
import java.util.Arrays;
public class Test29 {
	static int index;
	public static int rank(int key,int[] a) {
		int low=0,high=a.length;
		while(low<=high) {//二分法查找key的下标
			int mid=(low+high)/2;
			if(key<a[mid]) {
				high=mid-1;
			}else if(key>a[mid]) {
				low=mid+1;
			}else {
				while(a[mid-1]==a[mid]) {//找出最小的key下标
					mid--;
				}
				return index=mid;//最小的下标，即小于key的元素个数
			}
		}
		return -1;//不存在就返回-1
	}
	public static int count(int key,int[] a) {
		int count=1;//等于key的元素数量
		while(a[index]==a[index+1]) {
			count++;
			index++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] a= {3,4,7,1,4,9,7,0,-1,4};
		int key=7;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("小于key的元素数量："+rank(key, a));
		System.out.println("等于key的元素数量："+count(key, a));
	}
}
