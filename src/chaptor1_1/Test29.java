package chaptor1_1;
import java.util.Arrays;
public class Test29 {
	static int index;
	public static int rank(int key,int[] a) {
		int low=0,high=a.length;
		while(low<=high) {//���ַ�����key���±�
			int mid=(low+high)/2;
			if(key<a[mid]) {
				high=mid-1;
			}else if(key>a[mid]) {
				low=mid+1;
			}else {
				while(a[mid-1]==a[mid]) {//�ҳ���С��key�±�
					mid--;
				}
				return index=mid;//��С���±꣬��С��key��Ԫ�ظ���
			}
		}
		return -1;//�����ھͷ���-1
	}
	public static int count(int key,int[] a) {
		int count=1;//����key��Ԫ������
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
		System.out.println("С��key��Ԫ��������"+rank(key, a));
		System.out.println("����key��Ԫ��������"+count(key, a));
	}
}
