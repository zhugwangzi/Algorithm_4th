package chaptor1_1;
import java.util.Scanner;
public class Practise {
	public static void main(String[] args) {
		int i;
		double[] a=new double[4];
		double[] b=new double[4];
		String[] s=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("输入4行数据：姓名和两个数字，空格分开");
		for(i=0;i<4;i++) {
			s[i]=sc.next();
			a[i]=sc.nextDouble();
			b[i]=sc.nextDouble();
		}
		for(i=0;i<4;i++) {
			System.out.printf("%-3s%-4.1f%-4.1f%-4.3f%n",s[i],a[i],b[i],a[i]/b[i]);
		}
	}
}
