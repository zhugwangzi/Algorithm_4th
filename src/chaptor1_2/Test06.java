package chaptor1_2;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		System.out.println("请输入两个字符串，回车分开");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		if(s.length()==t.length()) {
			if(s.concat(s).indexOf(t)>=0) {
				
				System.out.println("s和t互为回环变位");
			}else {
				System.out.println("s和t不互为回环变位");
			}
		}
		System.out.println();
	}
}
