package chaptor1_2;
import edu.princeton.cs.algs4.*;
class MyException extends Exception{
	public MyException(String error) {
		super(error);
	}
}
public class Test11 {//Ϊ�����޸�����ΪTest1_2_11
	public static void main(String[] args) throws MyException{
		try {
			System.out.println("�������ڣ��·ݣ����");
			int m=StdIn.readInt();
			if(m>13||m<1) {
				throw new MyException("�·�Ӧ����1~12֮��");
			}
			int d=StdIn.readInt();
			if(d>31||m<1) {
				throw new MyException("����Ӧ����1~31֮��");
			}
			int y=StdIn.readInt();
			if(y<0) {
				throw new MyException("���Ӧ��Ϊ����");
			}
			Date date=new Date(m,d,y);
			StdOut.println(date);
		}catch (MyException e) {
			System.out.println(e);
		}
	}
}
