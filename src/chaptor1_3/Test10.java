package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test10 {
	static String reg1="\\*|\\/";//乘除运算正则表达式
	static String reg2="\\+|\\-";//加减运算正则表达式
	public static int compare(String s1, String s2)	{//比较运算顺序
		if(s1.matches(reg1)&&s2.matches(reg2)) {
			return 1;//先乘除
		}else if(s1.matches(reg2)&&s2.matches(reg1)){
			return -1;//后加减
		}else {
			return 0;
		}
	}
	public static void main(String[] args)	{
		//仅支持四则运算和()的组合，输入需要空格分开数字和运算符
		System.out.print("输入中序表达式：");
		String s=StdIn.readLine();
		String[] strs =s.split(" ");//获取表达式的运算符和数字
		Stack<String> mascot = new Stack<String>();//存储运算符的栈
		String exp = " ";//后序表达式
		for(int i = 0; i != strs.length; i++){//遍历所有元素
			if(strs[i].equals("(")) {//遇到'('就入栈
				mascot.push(strs[i]);
			}else if(strs[i].equals(")")){//遇到 ')' 
				String temp = mascot.pop();
				while(!temp.equals("("))	{
					exp = exp + " " + temp;
					temp = mascot.pop();
				}
			}else if(strs[i].matches(reg1)||strs[i].matches(reg2)){//遇到运算符
				if(mascot.isEmpty() || mascot.peek().equals("(") || 
						(compare(strs[i], mascot.peek()) >= 0)) {
					mascot.push(strs[i]);
				}else{
					while(!mascot.isEmpty() && compare(strs[i], mascot.peek())<=0 
							&& !mascot.peek().equals("(")) {
						exp = exp + " " + mascot.pop();
					}
					mascot.push(strs[i]);
				}
			}else{//遇到数字
				exp = exp + " " + strs[i];
			}
		}
		while(!mascot.isEmpty()) {
			exp = exp + " " + mascot.pop();
		}
		System.out.println("输出后序表达式："+exp);
	}
}