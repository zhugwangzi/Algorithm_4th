package chaptor1_4;
import java.util.*;
/**
 * @author zhug
 * @classname Test19
 * @description 矩阵局部最小元素
 * @date 2021/12/8 22:00
 */
public class Test19 {
    public static int[] localMin(int[][] a) {
        int n = a.length;
        //行的范围
        int row1 = 0, row3 = n - 1,row2=0;
        //列的范围
        int column1 = 0, column3 = n - 1,column2=0;
        //每次循环二分矩阵，取小的一半
        while (row1 <= row3 && column1 <= column3) {
            row2 = row1 + (row3 - row1) / 2;
            column2 = column1 + (column3 - column1) / 2;

            if (a[row2][column2] > a[row2 + 1][column2]) {
                row1 = row2 + 1;
            } else if (a[row2][column2] > a[row2 - 1][column2]) {
                row3 = row2 - 1;
            } else if (a[row2][column2] > a[row2][column2 + 1]) {
                column1 = column2 + 1;
            } else if (a[row2][column2] > a[row2][column2 - 1]) {
                column3 = column2 - 1;
            } else {break;}
        }
        return new int[]{row2, column2};
    }
    public static void main(String[] args) {
        //矩阵长度
        int n=8;
        //矩阵元素
        int i=0;
        List<Integer> list=new LinkedList<>();
        int[][] a=new int[n][n];
        while(list.size()!=n*n){
            int key=i++;
            //相同元素不会被添加进去
            list.add(key);
        }
        //乱序
        Collections.shuffle(list);
        //输出矩阵
        Iterator<Integer> it=list.iterator();
        for(i=0;i<n;i++) {
            for(int j=0;j<n;j++){a[i][j]=it.next();}
            for(int j=0;j<n;j++){System.out.printf("%4d",a[i][j]);}
            System.out.println();
        }
        System.out.println("局部最小值的行、列索引：");
        for(int x:localMin(a)){
            System.out.print(x+" ");
        }
    }
}
