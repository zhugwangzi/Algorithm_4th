package chaptor1_3;
import edu.princeton.cs.algs4.*;
import java.util.Scanner;
public class Calculate {
	public static void main(String[] args) {
		Stack<String> ops=new Stack<String>();//�����
		Stack<Double> vals=new Stack<Double>();//������
		Scanner scan=new Scanner(System.in);
		System.out.println("�����ַ������ÿո�ֿ����Ⱥš�=������������ʡ������");
		String str="";
		while(!str.equals("=")){
			str=scan.next();
			if(str.equals("(")) {
				continue;//������('ֱ�Ӷ�ȡ��һ���ַ���
			}else if(str.equals("=")) {
				break;//����'='�ͽ���ѭ��
			}
			if(str.equals("+")) {//�������ջops
				ops.push(str);
			}else if(str.equals("-")) {
				ops.push(str);
			}else 	if(str.equals("*")) {
				ops.push(str);
			}else 	if(str.equals("/")) {
				ops.push(str);
			}else 	if(str.equals(")")) {//����')'�Ϳ�ʼ����
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
				vals.push(Double.parseDouble(str));
			}
		}//���������'='�ͼ�����ȡ�ַ���
		scan.close();
		StdOut.println("value="+vals.pop());
	}
}
