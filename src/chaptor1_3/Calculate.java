package chaptor1_3;
import edu.princeton.cs.algs4.*;
import java.util.Scanner;
public class Calculate {
	public static void main(String[] args) {
		Stack<String> ops=new Stack<String>();//运算符
		Stack<Double> vals=new Stack<Double>();//操作数
		Scanner scan=new Scanner(System.in);
		System.out.println("输入字符串，用空格分开，等号“=”结束，不能省略括号");
		String str="";
		while(!str.equals("=")){
			str=scan.next();
			if(str.equals("(")) {
				continue;//遇到‘('直接读取下一个字符串
			}else if(str.equals("=")) {
				break;//遇到'='就结束循环
			}
			if(str.equals("+")) {//运算符入栈ops
				ops.push(str);
			}else if(str.equals("-")) {
				ops.push(str);
			}else 	if(str.equals("*")) {
				ops.push(str);
			}else 	if(str.equals("/")) {
				ops.push(str);
			}else 	if(str.equals(")")) {//遇到')'就开始运算
				String s=ops.pop();//ops栈弹出一个运算符
				double val=vals.pop();//vals栈弹出一个数
				if(s.equals("+")) {
					val=vals.pop()+val;//再弹出一个数，两个数进行计算
				}else if(s.equals("-")) {
					val=vals.pop()-val;
				}else if(s.equals("*")) {
					val=vals.pop()*val;
				}else if(s.equals("/")) {
					val=vals.pop()/val;
				}
				vals.push(val);
			}else {//遇到操作数就入栈vals
				vals.push(Double.parseDouble(str));
			}
		}//运算符不是'='就继续读取字符串
		scan.close();
		StdOut.println("value="+vals.pop());
	}
}
