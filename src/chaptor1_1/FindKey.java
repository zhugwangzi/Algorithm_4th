package chaptor1_1;
public class FindKey {
	public static int find(int key,int[] a) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;//
			if(key<a[mid]) {
				high=mid-1;
			}else if(key>a[mid]){
				low=mid+1;
			}else {
				return mid;//找到key的下标
			}
		}
		return-1;//没找到就返回-1
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};//排序好的数组
		int key=-15;
		System.out.println("key的位置是："+find(key, a));
	}
}
