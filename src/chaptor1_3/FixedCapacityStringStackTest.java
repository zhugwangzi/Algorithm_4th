package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class FixedCapacityStringStackTest {
	public static void main(String[] args) {
		System.out.println("�����뺬�� - �ľ��ӣ��ո�ֿ����ⵥ�ʡ��ַ���");
		String sentence=StdIn.readLine();
		String[] word=sentence.split(" ");//�Ѿ��Ӱ��ո�ֳɴ���
		int cap=word.length;
		FixedCapacityStringStack s=new FixedCapacityStringStack(cap);
		for(String x:word) {
			if(!x.equals("-")) {//��ȡ��Ԫ�ز��ǡ�-������ջ
				s.push(x);
			}else {
				System.out.println("- ǰ��ĵ����ǣ�"+s.pop());//������-���ͳ�ջ
				System.out.println("ʣ�� "+s.size()+"������");//������-���ͳ�ջ
				
			}
		}
	}
}
