package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test16 {
	public static Date[] readDates(String date) {
		String[] s=date.split(" ");
		int n=s.length;
		Date[] date2=new Date[n];
		for(int i=0;i<n;i++) {
			date2[i]=new Date(s[i]);
		}
		return date2;
	}
	public static void main(String[] args) {
		//���ڸ�ʽΪ m/d/y��ÿ������֮���ÿո�ֿ�
		System.out.println("�����������ڣ�");
		String dates=StdIn.readLine();
		Date[] date=readDates(dates);
		for(Date x:date) {
			System.out.println("�����ǣ�"+x);
		}
	}
}
