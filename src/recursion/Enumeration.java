package recursion;
public class Enumeration {
	public void select_3( ) {
		
	}
	public static void main(String[] args) {
		//��������ȡ��3��Ԫ�أ�����
		int[] a= {5,4,3,2,1};
		System.out.println("��forѭ��ʵ�֣�");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					System.out.print("["+a[i]+","+a[j]+","+a[k]+"]\t");
				}
			}
			System.out.println();
		}
		System.out.println("�õݹ麯��ʵ�֣�");
		
	}
}
