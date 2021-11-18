package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test04 {
	public static void main(String[] args) {
		System.out.println("输入含有 (){}[] 的字符串:");
		String str=StdIn.readLine();
		String[] s=str.split("");
		Stack<String> stack=new Stack<String>();
		for(String x:s) {//遍历每个括号
			if(x.equals("{")||x.equals("[")||x.equals("(")) {//遇到左括号就入栈
				stack.push(x);
			}else {//遇到右括号就出栈进行匹配
				if(x.equals(")")) {//若右括号是 ')'
					if(!stack.pop().equals("(")) {//如果出栈的元素没匹配到 '('就错误
						System.out.println("false");
						return;
					}
				}
				if(x.equals("]")) {//若右括号是 ']'
					if(!stack.pop().equals("[")) {//如果出栈的元素没匹配到 '['就错误
						System.out.println("false");
						return;
					}
				}
				if(x.equals("}")) {//若右括号是 '}'
					if(!stack.pop().equals("{")) {//如果出栈的元素没匹配到 '{就错误
						System.out.println("false");
						return;
					}
				}
			}
		}
		System.out.println("true");//没有错误则输出true
	}
}
