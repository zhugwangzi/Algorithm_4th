package chaptor1_1;
import edu.princeton.cs.algs4.*;
public class Test31{
    public interface IShuffle{
        public void shuffle(int[] a);
    }    
    public static void ShuffleTest(IShuffle shuffle, int m, int n){
        int[][] s = new int[m][m];
        for (int k = 0; k < m; k++){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = i;
            }
            shuffle.shuffle(a);
            for (int i = 0; i < n; i++) {
                s[i][a[i]]++;
            }
        }
        for (int i = 0; i < m; i++){//打印m*n的表格
            for (int j = 0; j < n; j++) {
                StdOut.printf("%7d", s[i][j]);
            }
            StdOut.println();
        }
    }
    public static void main(String[] args){
        int m =5;
        int n =4;
        // closure
        IShuffle shuffle = new IShuffle(){
            public void shuffle(int[] a){
                StdRandom.shuffle(a);
            }
        };        
        ShuffleTest(shuffle, m, n);
    }
}