package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test15 {
	public static void main(String[] args) {
		System.out.println("����k");
		int k=StdIn.readInt();
		System.out.println("�����ַ�����һ��һ����end����");
		Queue<String> q=new Queue<String>();
		String str="";
		while(!str.equals("end")){
			
			str=StdIn.readLine();
			if(!str.equals("end")) {
				q.enqueue(str);//��end �������ַ�������
			}
		}
		int i=0;
		for(String x:q){
			if(i++==q.size()-k) {
				System.out.println("������"+k+"���ַ���: "+x);
				break;
			}
		}
	}
}
