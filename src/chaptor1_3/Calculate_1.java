package chaptor1_3;
import edu.princeton.cs.algs4.*;
import java.util.Scanner;
/*
 * �Ż����������ַ���ʱ����Ҫ�ӿո�͵Ⱥ�
 */
public class Calculate_1 {
	public static void main(String[] args) {
		Stack<String> ops=new Stack<String>();//�����
		Stack<Double> vals=new Stack<Double>();//������
		Scanner scan=new Scanner(System.in);
		System.out.println("�����ַ���");
		String str=scan.next();
		scan.close();
		String[] c=str.split("");
		for(String x:c) {
			if(x.equals("(")){//������('ֱ�Ӷ�ȡ��һ���ַ���
				continue;
			}
			if(x.equals("+")) {//�������ջops
				ops.push(x);
			}else if(x.equals("-")) {
				ops.push(x);
			}else 	if(x.equals("*")) {
				ops.push(x);
			}else 	if(x.equals("/")) {
				ops.push(x);
			}else 	if(x.equals(")")) {//����')'�Ϳ�ʼ����
				String s=ops.pop();//opsջ����һ�������
				double val=vals.pop();//valsջ����һ����
				if(s.equals("+")) {
					val=vals.pop()+val;//�ٵ���һ���������������м���
				}else if(s.equals("-")) {
					val=vals.pop()-val;
				}else if(s.equals("*")) {
					val=vals.pop()*val;
				}else if(s.equals("/")) {
					val=vals.pop()/val;
				}
				vals.push(val);
			}else {//��������������ջvals
				vals.push(Double.parseDouble(x));
			}
		}
		StdOut.println("value="+vals.pop());
	}
}
