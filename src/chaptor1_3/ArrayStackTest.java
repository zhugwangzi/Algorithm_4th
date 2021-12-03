package chaptor1_3;

public class ArrayStackTest {
	public static void main(String[] args) {
		ArrayStack<Double> stack=new ArrayStack<Double>();
		stack.push(1.2);
		stack.push(2.0);
		stack.push(4.2);
		stack.push(2.3);
		System.out.println("栈的容量是："+stack.size());
		for(double x:stack) {
			System.out.println("弹出 "+stack.pop()+" 还剩余 "
					+stack.size()+"个元素");
			System.out.println("栈是否为空："+stack.isEmpty());
		}
	}
}
