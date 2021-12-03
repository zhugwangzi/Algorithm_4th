package chaptor1_1;
public class Test30 {
	public static int gcd(int p,int q) {//欧几里得算法
		if(q==0) {
			return p;
		}
		return gcd(q,p%q);
	}
	public static void main(String[] args) {
		boolean[][] b=new boolean[5][5];
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[0].length;j++){
				b[i][j]=gcd(i,j)==1?true:false;
			}
		}
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[0].length;j++){
				System.out.printf("%7b",b[i][j]);
			}
			System.out.println();
		}
	}
}
