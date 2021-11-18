package chaptor1_1;
public class Matrix {
	public static void printMatrix(int[][] m) {
		for(int x=0;x<m.length;x++) {//行
			for(int y=0;y<m[0].length;y++) {//列
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
		for(int i=0;i<3;i++) {//行
			for(int j=0;j<3;j++) {//列
				for(int k=0;k<4;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}	
		}
		printMatrix(c);
	}
}

