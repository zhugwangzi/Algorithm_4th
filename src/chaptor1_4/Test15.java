package chaptor1_4;

public class Test15 {//a[]�����С��������
	public static int count2(int[] a) {//2-Sum�����Լ���ⷨ
		int i=0,j=a.length-1,count=0;//����β���м����
		while(i<j) {
			if(-a[i]<a[j]) {j--;}//�ұ�̫���j����
			else if(-a[i]>a[j]) {i++;}//���̫С��i����
			else {
				System.out.println("["+a[i]+","+a[j]+"]");
				count++;
				i++;j--;
			}
		}
		return count;
	}
	public static int count3(int[] a) {//3-sum��ƽ������ⷨ
		int count=0;//����β���м����
		for(int i=0;a[i]<0;i++) {//a[i]С��0
			for(int j=i+1,k=a.length-1-i;j<k;){//j,k����β���м�Ѱ��
				if(-a[i]-a[j]>a[k]) {j++;}//���Ķ�j������
				else if(-a[i]-a[j]<a[k]) {k--;}//���Ķ�k������
				else {
					System.out.print("["+a[i]+","+a[j]+","+a[k]+"]  ");
					count++;
					j++;k--;
				}
			}//��һ�ֽ���ʱj=k��Ȼ��i����
		}
		return count;
	}
	public static int count3_1(int[] a) {//3-Sum����������ⷨ
		int n=a.length,count=0;
		for(int i=0;a[i]<0;i++) {//�α��ϵ��Ż���
			for(int j=i+1;j<n;j++) {
				for(int k=n-1-i;j<k&&a[k]>0;k--) {
					if(a[i]+a[j]+a[k]==0) {
						System.out.print("["+a[i]+","+a[j]+","+a[k]+"]  ");
						count++;
						break;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] a= {-5,-4,-3,-2,0,1,2,3,5,7};
		System.out.println("3-Sum����������ⷨ��");
		System.out.println(count3_1(a));
		System.out.println("3-Sum��ƽ������ⷨ��");
		System.out.println(count3(a));
	}
}
