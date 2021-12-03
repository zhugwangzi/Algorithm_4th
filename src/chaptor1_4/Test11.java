package chaptor1_4;
import java.util.Arrays;
public class Test11 {
	private int[] a;
	public Test11(int[] keys) {//��������keys������a����������a
		a=new int[keys.length];
		for(int i=0;i<keys.length;i++) {a[i]=keys[i];}
		Arrays.sort(a);
	}
	public boolean contains(int key) {return rank(a,key)!=-1;}
	
	public static int rank(int[] a,int key) {
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(key>a[mid]) {low=mid+1;}
			else if(key<a[mid]) {high=mid-1;}
			else {return mid;}
		}
		return -1;
	}
	public static int howMany(int[] a,int key) {
		int index=rank(a, key);
		if(index==-1) {return 0;}
		int i=index-1,j=index+1;//i,j�ֱ�Ѱ������ߺ����ұߵ�key
		for(;i>=0&&a[i]==key;i--);//���a[i+1]==key
		for(;j<a.length&&a[j]==key;j++);//���a[j-1]==key
		return j-1-i;
	}
	public static void main(String[] args) {
		int[] keys= {1,-1};
		int key=-1;
		Test11 t=new Test11(keys);
		System.out.println("�Ƿ���key��"+t.contains(key));
		System.out.println("key�ĸ�����"+howMany(t.a, key));
	}
}
