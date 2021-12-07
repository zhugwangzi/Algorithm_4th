package chaptor1_5;
import java.util.Arrays;
/*
证明题目：
设连成一棵高度为n(n>=1)的树所需的最少点数为k(n),记作h(k(n))=n，h(k(1))=1,h(k(2))=2,...，
小于k(n)个点无法形成h(k(n))高度的树，k(n)个点形成的树最大高度为h(k(n)).
则有结论①h(k(n))=h(k(n-1))+1;

下面证明结论②：对定义域内任意的x1<x2,有h(x1)<h(x2).
若存在x1<x2使得h(x1)=h(x2),则连成h(x2)高度的树的最小点数是x1，与题意不符；
若存在x1<x2使得h(x1)>h(x2),则可以把h(x1)树去掉部分点后，使得剩下x3(x3<x1)
个点构成的树h(x3)=h(x2)，即连成h(x2)高度的树的最小点数是x3，与题意不符；
因此结论②成立。

两棵由k(n-1)个点组成的最高的树合并，高度会加1，即结论③：h(k(n-1)+k(n-1))=h(2*k(n-1))=h(k(n-1))+1
由①③可知h(2*k(n-1))=h(k(n))，再由②可得k(n)=2*k(n-1)=4*k(n-2)=...=2^(n-1)*k(1).
易知k(1)=2,故k(n)=2^n.记N=2^n,则n=logN，N个点形成的最大高度h(N)=n=logN，证毕。
 */
public class Test14 {
	private int[] id;//i是触点，id[i]表示i的父节点
	private int[] height;//第i棵树的高度
	private int count;//分量数目
	public Test14(int N) {//初始化N个分量、N个触点、N棵树
		count=N;
		id=new int[N];
		height=new int[N];
		for(int i=0;i<N;i++) {height[i]=0;id[i]=i;}
	}
	public boolean isConnected(int p,int q) {return find(p)==find(q);}
	public int find(int p) {
		while(p!=id[p]) {p=id[p];}
		return p;//根节点
	}
	public void union(int p,int q) {
		int proot=find(p);//根节点
		int qroot=find(q);
		if(proot==qroot) {return;}//p,q在同一个分量里面就结束
		if(height[proot]<height[qroot]) {//总是把小树链接到大树
			id[proot]=qroot;//proot链接到qroot
		}else {
			id[qroot]=proot;//qroot链接到proot
			if(height[proot]==height[qroot]) {height[proot]+=1;}//proot树高度+1
		}
		count--;
	}
	public static void main(String[] args) {
		int[][] a= {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};
		Test14 t=new Test14(10);
		System.out.println("未处理的触点数组：	      "+Arrays.toString(t.id));
		for(int[] x:a) {
			t.union(x[0],x[1]);
			System.out.println("处理 "+Arrays.toString(x)+" 后的触点数组："+
					Arrays.toString(t.id));
		}
		System.out.print("每个触点对应的子树高度：");
		for(int x: t.height){
			System.out.print(x+" ");
		}
	}
}
