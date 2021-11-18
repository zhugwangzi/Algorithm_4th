package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class FixedCapacityStringStackTest {
	public static void main(String[] args) {
		System.out.println("请输入含有 - 的句子，空格分开任意单词、字符：");
		String sentence=StdIn.readLine();
		String[] word=sentence.split(" ");//把句子按空格分成词语
		int cap=word.length;
		FixedCapacityStringStack s=new FixedCapacityStringStack(cap);
		for(String x:word) {
			if(!x.equals("-")) {//读取的元素不是“-”就入栈
				s.push(x);
			}else {
				System.out.println("- 前面的单词是："+s.pop());//遇到“-”就出栈
				System.out.println("剩余 "+s.size()+"个单词");//遇到“-”就出栈
				
			}
		}
	}
}
