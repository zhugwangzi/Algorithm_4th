package recursion;
import java.util.*;
public class QuickSort {
	public static void swap(int x,int y) {
		int t=x;
		x=y;
		y=t;
	}
	public static void quickSort(int[] a,int x,int y) {//����������򷽷�
		if(y==x&&x<y) {//��׼����
			return;
		}
		int pivot=a[x];//��׼ֵ
		int j=0;//��С������±�
		for(int i=x+1;i<=y;i++) {//С���������
			if(a[i]<pivot) {
				swap(a[i],a[x+j]);
				j++;
			}
		}//ѭ���������С������j��Ԫ��
		swap(pivot,a[x+j]);//�ѻ�׼ֵ��a[x+j]����
		//��ʱ����ֳ������֣�a[x]~a[x+j-1],a[x+j],a[x+j]~a[y]
		quickSort(a,x,x+j-1);
		quickSort(a,x+j,y);
	}
	public static void main(String[] args) {
		int a[]= {8,7,6,5,4,3,2,1};
		quickSort(a,0,7);
		System.out.println("���������");
		for(int i=0;i<a.length;i++) {
			System.out.print(a+" ");
		}
	}
}
