package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test04 {
	public static void main(String[] args) {
		System.out.println("���뺬�� (){}[] ���ַ���:");
		String str=StdIn.readLine();
		String[] s=str.split("");
		Stack<String> stack=new Stack<String>();
		for(String x:s) {//����ÿ������
			if(x.equals("{")||x.equals("[")||x.equals("(")) {//���������ž���ջ
				stack.push(x);
			}else {//���������žͳ�ջ����ƥ��
				if(x.equals(")")) {//���������� ')'
					if(!stack.pop().equals("(")) {//�����ջ��Ԫ��ûƥ�䵽 '('�ʹ���
						System.out.println("false");
						return;
					}
				}
				if(x.equals("]")) {//���������� ']'
					if(!stack.pop().equals("[")) {//�����ջ��Ԫ��ûƥ�䵽 '['�ʹ���
						System.out.println("false");
						return;
					}
				}
				if(x.equals("}")) {//���������� '}'
					if(!stack.pop().equals("{")) {//�����ջ��Ԫ��ûƥ�䵽 '{�ʹ���
						System.out.println("false");
						return;
					}
				}
			}
		}
		System.out.println("true");//û�д��������true
	}
}
