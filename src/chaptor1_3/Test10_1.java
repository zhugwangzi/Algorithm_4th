package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test10_1 {
	public static void main(String[] args) {
		/*Ҫ�����벻��ʡ���κ����ţ��ո�ֿ����ֺ������
		*����( ( 1 + 13 ) * ( 13 - 1 ) )
		*/
		System.out.print("������������ʽ��");
		String str=StdIn.readLine();
		String[] s=str.split(" ");
		
		String reg="\\+|\\-|\\*|\\/";//��������������ʽ
		Stack<String> ops=new Stack<String>();//�����ջ
		Stack<String> vals=new Stack<String>();//����ջ
		for(String x:s) {
			if(x.equals("(")) {
				continue;//���� "("
			}else	if(x.matches(reg)) {//�������opsջ
				ops.push(x);
			}else if(x.equals(")")) {//����")"�Ͱ�n1 n2 op��Ϊ������valsջ
				String n2=vals.pop();
				String n1=vals.pop();
				String op=ops.pop();
				vals.push(n1+" "+n2+" "+op+" ");
			}else{//������valsջ
				vals.push(x);
			}
		}//ѭ��������valsֻʣ��һ��Ԫ�أ���������ʽ
		System.out.println("������ʽ��"+vals.pop());
	}
}
