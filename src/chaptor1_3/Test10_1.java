package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test10_1 {
	public static void main(String[] args) {
		/*要求输入不能省略任何括号，空格分开数字和运算符
		*比如( ( 1 + 13 ) * ( 13 - 1 ) )
		*/
		System.out.print("请输入中序表达式：");
		String str=StdIn.readLine();
		String[] s=str.split(" ");
		
		String reg="\\+|\\-|\\*|\\/";//四则运算正则表达式
		Stack<String> ops=new Stack<String>();//运算符栈
		Stack<String> vals=new Stack<String>();//数字栈
		for(String x:s) {
			if(x.equals("(")) {
				continue;//忽略 "("
			}else	if(x.matches(reg)) {//运算符入ops栈
				ops.push(x);
			}else if(x.equals(")")) {//遇到")"就把n1 n2 op作为整体入vals栈
				String n2=vals.pop();
				String n1=vals.pop();
				String op=ops.pop();
				vals.push(n1+" "+n2+" "+op+" ");
			}else{//数字入vals栈
				vals.push(x);
			}
		}//循环结束后vals只剩下一个元素，即后序表达式
		System.out.println("后序表达式："+vals.pop());
	}
}
