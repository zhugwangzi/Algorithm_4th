package chaptor1_3;
import edu.princeton.cs.algs4.*;
import java.util.Scanner;
/*
 * 优化代码输入字符串时不需要加空格和等号
 */
public class Calculate_1 {
	public static void main(String[] args) {
		Stack<String> ops=new Stack<String>();//运算符
		Stack<Double> vals=new Stack<Double>();//操作数
		Scanner scan=new Scanner(System.in);
		System.out.println("输入字符串");
		String str=scan.next();
		scan.close();
		String[] c=str.split("");
		for(String x:c) {
			if(x.equals("(")){//遇到‘('直接读取下一个字符串
				continue;
			}
			if(x.equals("+")) {//运算符入栈ops
				ops.push(x);
			}else if(x.equals("-")) {
				ops.push(x);
			}else 	if(x.equals("*")) {
				ops.push(x);
			}else 	if(x.equals("/")) {
				ops.push(x);
			}else 	if(x.equals(")")) {//遇到')'就开始运算
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
				vals.push(Double.parseDouble(x));
			}
		}
		StdOut.println("value="+vals.pop());
	}
}
