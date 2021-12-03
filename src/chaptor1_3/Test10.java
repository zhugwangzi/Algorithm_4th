package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test10 {
	static String reg1="\\*|\\/";//�˳�����������ʽ
	static String reg2="\\+|\\-";//�Ӽ�����������ʽ
	public static int compare(String s1, String s2)	{//�Ƚ�����˳��
		if(s1.matches(reg1)&&s2.matches(reg2)) {
			return 1;//�ȳ˳�
		}else if(s1.matches(reg2)&&s2.matches(reg1)){
			return -1;//��Ӽ�
		}else {
			return 0;
		}
	}
	public static void main(String[] args)	{
		//��֧�����������()����ϣ�������Ҫ�ո�ֿ����ֺ������
		System.out.print("����������ʽ��");
		String s=StdIn.readLine();
		String[] strs =s.split(" ");//��ȡ���ʽ�������������
		Stack<String> mascot = new Stack<String>();//�洢�������ջ
		String exp = " ";//������ʽ
		for(int i = 0; i != strs.length; i++){//��������Ԫ��
			if(strs[i].equals("(")) {//����'('����ջ
				mascot.push(strs[i]);
			}else if(strs[i].equals(")")){//���� ')' 
				String temp = mascot.pop();
				while(!temp.equals("("))	{
					exp = exp + " " + temp;
					temp = mascot.pop();
				}
			}else if(strs[i].matches(reg1)||strs[i].matches(reg2)){//���������
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
			}else{//��������
				exp = exp + " " + strs[i];
			}
		}
		while(!mascot.isEmpty()) {
			exp = exp + " " + mascot.pop();
		}
		System.out.println("���������ʽ��"+exp);
	}
}