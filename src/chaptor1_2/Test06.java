package chaptor1_2;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		System.out.println("�����������ַ������س��ֿ�");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		if(s.length()==t.length()) {
			if(s.concat(s).indexOf(t)>=0) {
				
				System.out.println("s��t��Ϊ�ػ���λ");
			}else {
				System.out.println("s��t����Ϊ�ػ���λ");
			}
		}
		System.out.println();
	}
}
