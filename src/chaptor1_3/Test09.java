package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test09 {
	public static void main(String[] args) {
		String reg="\\+|\\-|\\*|\\/";//��������������ʽ
		System.out.println("������ʽ���ÿո�ֿ����ֺ����������ʡ������:");
		String str=StdIn.readLine();
		Stack<String> ops=new Stack<String>();//�����ջ
		Stack<String> vals=new Stack<String>();//������ջ
		String[] s=str.split(" ");//��ȡÿ���ַ�
		for(String x:s) {//����ÿ���ַ�
			
			if(x.matches(reg)) {
				ops.push(x);//���������opsջ
			}else if(x.equals(")")) {//���� ')' �Ͳ���һ��������
				String num2=vals.pop();
				String num1=vals.pop();
				String op=ops.pop();
				vals.push("("+num1+op+num2+")");//��(num1+num2)����valsջ
			}else {//��������valsջ
				vals.push(x);
			}
		}
		StdOut.println(vals.pop());//����valsջֻ��һ��Ԫ�أ������ʽ
	}
}
