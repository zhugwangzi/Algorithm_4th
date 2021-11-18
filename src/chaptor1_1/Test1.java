package chaptor1_1;
public class Test1 {
	public static void printMatrix(int[][] m) {
		for(int x=0;x<m.length;x++) {
			for(int y=0;y<m[0].length;y++) {
				System.out.print(y==m[0].length-1?m[x][y]
						+"\n":m[x][y]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[][] a=new int[][] {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		printMatrix(a);
		int[][] b=new int[][] {{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
		printMatrix(b);
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<4;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}	
		}
		printMatrix(c);
	}
}
