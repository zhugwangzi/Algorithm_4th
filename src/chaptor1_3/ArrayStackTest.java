package chaptor1_3;

public class ArrayStackTest {
	public static void main(String[] args) {
		ArrayStack<Double> stack=new ArrayStack<Double>();
		stack.push(1.2);
		stack.push(2.0);
		stack.push(4.2);
		stack.push(2.3);
		System.out.println("ջ�������ǣ�"+stack.size());
		for(double x:stack) {
			System.out.println("���� "+stack.pop()+" ��ʣ�� "
					+stack.size()+"��Ԫ��");
			System.out.println("ջ�Ƿ�Ϊ�գ�"+stack.isEmpty());
		}
	}
}
