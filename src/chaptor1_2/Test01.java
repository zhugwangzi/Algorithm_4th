package chaptor1_2;
import java.util.Scanner;
import edu.princeton.cs.algs4.*;
public class Test01 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("���������N");
		int N=s.nextInt();
		Point2D[] p=new Point2D[N];//��������N���������
		
		for(int i=0;i<N;i++) {//����N����λ�������ڵĵ�
			p[i]=new Point2D(Math.random(),Math.random());
//			p[i].draw();������λ�������ڵĵ�
		}
		double minDistance=p[0].distanceTo(p[1]);
		for(int i=0;i<N;i++) {//��������������ľ���
			for(int j=i+1;j<N;j++) {
				double d=p[i].distanceTo(p[j]);
				minDistance=(d<=minDistance)?d:minDistance;
			}
		}
		System.out.println("��̾��룺"+minDistance);
	}
}
