package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test11 {
	public static void main(String[] args) {
		System.out.println("�����������ʽ���ո�ֿ����ֺ��������");
		String str=StdIn.readLine();
		String[] s=str.split(" ");
		String reg="\\+|\\-|\\*|\\/";
		Stack<Double> stack=new Stack<Double>();//������ջ
		for(String x:s) {
			if(x.matches(reg)) {//����������ͽ��м���
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
			}else {//�������־���ջ
				stack.push(Double.parseDouble(x));
			}
		}
		System.out.println(str+" = "+stack.pop());
	}
}
