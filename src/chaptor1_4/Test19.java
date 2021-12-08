package chaptor1_4;
import java.util.*;
/**
 * @author zhug
 * @classname Test19
 * @description 矩阵局部最小元素
 * @date 2021/12/8 22:00
 */
public class Test19 {
    //循环次数
    public static int count;
    //寻找局部最小值
    public static int[] localMin(int[][] a) {
        int n = a.length;
        //行的范围
        int row1 = 0, row3 = n - 1,row2=0;
        //列的范围
        int column1 = 0, column3 = n - 1,column2=0;
        //每次循环二分矩阵，取小的一半
        while (row1 <=row3 && column1 <=column3) {
            count++;
            row2 = row1 + (row3 - row1) / 2;
            column2 = column1 + (column3 - column1) / 2;
            //前四个判断语句的第一个条件是为了防止索引越界
            if (row2<n-1&&a[row2][column2] > a[row2 + 1][column2]) {
                row1 = row2 + 1;
            } else if (row2>0&&a[row2][column2] > a[row2 - 1][column2]) {
                row3 = row2 - 1;
            } else if (column2<n-1&&a[row2][column2] > a[row2][column2 + 1]) {
                column1 = column2 + 1;
            } else if (column2>0&&a[row2][column2] > a[row2][column2 - 1]) {
                column3 = column2 - 1;
            } else {break;}
        }
        return new int[]{row2,column2};

    }
    public static void main(String[] args) {
        //矩阵长度n
        int n=10;
        List<Integer> list=new LinkedList<>();
        int[][] a=new int[n][n];
        for(int i=0;i<n*n;i++){list.add(i);}
        //乱序
        Collections.shuffle(list);
        //产生n*n的矩阵
        Iterator<Integer> it=list.iterator();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                a[i][j]=it.next();
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }
        System.out.print("局部最小值的行、列索引：");
        for(int x:localMin(a)){System.out.print(x+" ");}
        System.out.println("\n执行了"+count+"次循环");
    }
}
