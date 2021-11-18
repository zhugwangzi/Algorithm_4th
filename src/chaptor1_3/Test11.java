package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test11 {
	public static void main(String[] args) {
		System.out.println("请输入后序表达式，空格分开数字和运算符：");
		String str=StdIn.readLine();
		String[] s=str.split(" ");
		String reg="\\+|\\-|\\*|\\/";
		Stack<Double> stack=new Stack<Double>();//操作数栈
		for(String x:s) {
			if(x.matches(reg)) {//遇到运算符就进行计算
				double n2=stack.pop();
				double n1=stack.pop();
				if(x.equals("+")) {
					stack.push(n1+n2);
				}else	if(x.equals("-")) {
					stack.push(n1-n2);
				}else	if(x.equals("*")) {
					stack.push(n1*n2);
				}else	if(x.equals("/")) {
					stack.push(n1/n2);
				}
			}else {//遇到数字就入栈
				stack.push(Double.parseDouble(x));
			}
		}
		System.out.println(str+" = "+stack.pop());
	}
}
