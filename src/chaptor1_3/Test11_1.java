package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test11_1 {
	public static void main(String[] args){
		System.out.println("������0~9���������������ʽ��");
		String str=StdIn.readLine();
		String[] strs =str.split(" ");
		Stack<Double> s = new Stack<Double>();
		String reg="\\*|\\/|\\+|\\-";//��������������ʽ
		for(int i = 0; i != strs.length; i++){
			
			if(strs[i].matches(reg)){
				double x1 = s.pop();
				double x2 = s.pop();
				switch(strs[i].charAt(0)){
					case '+':
						x1 = x1 + x2;
						break;
					case '-':
						x1 = x2 - x1;
						break;
					case '*':
						x1 = x1 * x2;
						break;
					case '/':
						x1 = x2 / x1;
						break;
				}
				s.push(x1);
			}else {
				s.push(Double.parseDouble(strs[i]));
			}
		}
		System.out.println(str+"="+s.pop());
	}
}
