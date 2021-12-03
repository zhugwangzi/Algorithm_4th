package chaptor1_4;

public class Test12 {
	public static void commonNums(int[] a1,int[] a2) {
		int i=0,j=0;//i,j分别指向a1,a2
		int value=0;//前一个打印的值
		if(a1[0]==a2[0]) {System.out.println(a1[0]);}//处理第一个元素
		while(i<a1.length&&j<a2.length) {
			if(a1[i]<a2[j]) {i++;}//若a1[i]太小，i递增
			else if(a1[i]>a2[j]) {j++;}//若a2[i]太小，j递增
			
			else {//i,j指向的元素相等
				if(value!=a1[i]) {	//不等于前一个打印的值
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
