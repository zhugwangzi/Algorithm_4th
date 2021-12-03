package recursion;
public class TongSort {
	public static void main(String[] args) {
		//桶排序，对数组从小到大排序
		int[] a=new int[11];//创建a[0]~a[10]数组，初始值为0
		int[] b= {6,2,9,6,1,0,3};
		for(int i=0;i<b.length;i++) {
			a[b[i]]++;//记录i出现了几次
		}
		for(int i=0;i<11;i++) {
			for(int j=1;j<=a[i];j++) {
				System.out.print(i+" ");//i出现几次就打印几次
			}
		}
	}
}
