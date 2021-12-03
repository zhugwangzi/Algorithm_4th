package recursion;

public class FindMax {
	//�ݹ���ַ��������ֵ��ʱ�临�Ӷ�O(log(N))
	public static int find1(int[] a) {
		return findMax1(a, 0, a.length-1);
	}
	public static int findMax1(int[] a,int low,int high) {
		if(low>high){return -1;}
		if(high-low<=1) {return Math.max(a[low], a[high]);}
		int mid=low+(high-low)/2;
		return Math.max(findMax1(a, low, mid),findMax1(a, mid+1, high));
	}
	//�ݹ顰ȥͷ�����������ֵ��ʱ�临�Ӷ�O(N)
	public static int find2(int[] a) {
		return findMax2(a, 0, a.length-1);
	}
	public static int findMax2(int[] a,int low,int high) {
		if(high-low<=1) {return Math.max(a[low], a[high]);}
		return Math.max(a[low], findMax2(a, low+1, high));
	}
	public static void main(String[] args) {
		int[] a1= {0,-2,12,9,-4,10,0,32,33};
		int[] a2= {2};
		System.out.println(find1(a1));
		System.out.println(find1(a2));
		System.out.println(find2(a1));
		System.out.println(find2(a2));
	}
}
