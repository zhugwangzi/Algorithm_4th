package recursion;
public class TongSort {
	public static void main(String[] args) {
		//Ͱ���򣬶������С��������
		int[] a=new int[11];//����a[0]~a[10]���飬��ʼֵΪ0
		int[] b= {6,2,9,6,1,0,3};
		for(int i=0;i<b.length;i++) {
			a[b[i]]++;//��¼i�����˼���
		}
		for(int i=0;i<11;i++) {
			for(int j=1;j<=a[i];j++) {
				System.out.print(i+" ");//i���ּ��ξʹ�ӡ����
			}
		}
	}
}
