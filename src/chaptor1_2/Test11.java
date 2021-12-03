package chaptor1_2;
import edu.princeton.cs.algs4.*;
class MyException extends Exception{
	public MyException(String error) {
		super(error);
	}
}
public class Test11 {//为整齐修改类名为Test1_2_11
	public static void main(String[] args) throws MyException{
		try {
			System.out.println("输入日期，月份，年份");
			int m=StdIn.readInt();
			if(m>13||m<1) {
				throw new MyException("月份应该在1~12之间");
			}
			int d=StdIn.readInt();
			if(d>31||m<1) {
				throw new MyException("日期应该在1~31之间");
			}
			int y=StdIn.readInt();
			if(y<0) {
				throw new MyException("年份应该为正数");
			}
			Date date=new Date(m,d,y);
			StdOut.println(date);
		}catch (MyException e) {
			System.out.println(e);
		}
	}
}
