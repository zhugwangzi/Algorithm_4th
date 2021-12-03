package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test09 {
	public static void main(String[] args) {
		String reg="\\+|\\-|\\*|\\/";//四则运算正则表达式
		System.out.println("输入表达式，用空格分开数字和运算符，不省略括号:");
		String str=StdIn.readLine();
		Stack<String> ops=new Stack<String>();//运算符栈
		Stack<String> vals=new Stack<String>();//操作数栈
		String[] s=str.split(" ");//获取每个字符
		for(String x:s) {//遍历每个字符
			
			if(x.matches(reg)) {
				ops.push(x);//把运算符入ops栈
			}else if(x.equals(")")) {//遇到 ')' 就补充一个左括号
				String num2=vals.pop();
				String num1=vals.pop();
				String op=ops.pop();
				vals.push("("+num1+op+num2+")");//把(num1+num2)存入vals栈
			}else {//操作数入vals栈
				vals.push(x);
			}
		}
		StdOut.println(vals.pop());//最终vals栈只有一个元素，即表达式
	}
}
