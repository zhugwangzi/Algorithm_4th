package recursion;
/*
*������̨�����⣺
*��n��̨�ף�����ÿ�ο�����1��2��̨��
*����1~10��̨�׸��м�������
*/
public class FrogJumpFloor {
	/*n��̨��ÿ�ο�����1��2����������1����ʣf(n-1)�ַ�����
	 * ������2����ʣf(n-2)������,���f(n)=f(n-1)+f(n-2) 
	 */
	public static int f(int n) {
		if(n<=2) {//��׼����,ע��n=1,2���ǻ�׼
			return n;
		}
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			System.out.println(i+"��̨����"+f(i)+"������");
		}
	}
}
