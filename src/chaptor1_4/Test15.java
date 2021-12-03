package chaptor1_4;

public class Test15 {//a[]必须从小到大排序
	public static int count2(int[] a) {//2-Sum的线性级别解法
		int i=0,j=a.length-1,count=0;//从首尾往中间遍历
		while(i<j) {
			if(-a[i]<a[j]) {j--;}//右边太大就j左移
			else if(-a[i]>a[j]) {i++;}//左边太小就i右移
			else {
				System.out.println("["+a[i]+","+a[j]+"]");
				count++;
				i++;j--;
			}
		}
		return count;
	}
	public static int count3(int[] a) {//3-sum的平方级别解法
		int count=0;//从首尾往中间遍历
		for(int i=0;a[i]<0;i++) {//a[i]小于0
			for(int j=i+1,k=a.length-1-i;j<k;){//j,k从首尾往中间寻找
				if(-a[i]-a[j]>a[k]) {j++;}//负的多j就右移
				else if(-a[i]-a[j]<a[k]) {k--;}//正的多k就左移
				else {
					System.out.print("["+a[i]+","+a[j]+","+a[k]+"]  ");
					count++;
					j++;k--;
				}
			}//第一轮结束时j=k，然后i右移
		}
		return count;
	}
	public static int count3_1(int[] a) {//3-Sum的立方级别解法
		int n=a.length,count=0;
		for(int i=0;a[i]<0;i++) {//课本上的优化版
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
		System.out.println("3-Sum的立方级别解法：");
		System.out.println(count3_1(a));
		System.out.println("3-Sum的平方级别解法：");
		System.out.println(count3(a));
	}
}
