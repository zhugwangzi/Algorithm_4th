package chaptor1_4;

public class Test12 {
	public static void commonNums(int[] a1,int[] a2) {
		int i=0,j=0;//i,j�ֱ�ָ��a1,a2
		int value=0;//ǰһ����ӡ��ֵ
		if(a1[0]==a2[0]) {System.out.println(a1[0]);}//�����һ��Ԫ��
		while(i<a1.length&&j<a2.length) {
			if(a1[i]<a2[j]) {i++;}//��a1[i]̫С��i����
			else if(a1[i]>a2[j]) {j++;}//��a2[i]̫С��j����
			
			else {//i,jָ���Ԫ�����
				if(value!=a1[i]) {	//������ǰһ����ӡ��ֵ
					System.out.println(a1[i]);
					value=a1[i];
				}
				i++;
				j++;
			}
		}
	}
	public static void main(String[] args) {
		int[] a1= {0,0,0,1,1,3,5,7};
		int[] a2= {0,1,3,3,5,5,7};
		commonNums(a1, a2);
	}
}
