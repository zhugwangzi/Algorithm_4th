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
				return mid;//�ҵ�key���±�
			}
		}
		return-1;//û�ҵ��ͷ���-1
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};//����õ�����
		int key=-15;
		System.out.println("key��λ���ǣ�"+find(key, a));
	}
}
