package chaptor1_4;
import java.util.*;
/**
 * @author zhug
 * @classname Test19
 * @description ����ֲ���СԪ��
 * @date 2021/12/8 22:00
 */
public class Test19 {
    //ѭ������
    public static int count;
    //Ѱ�Ҿֲ���Сֵ
    public static int[] localMin(int[][] a) {
        int n = a.length;
        //�еķ�Χ
        int row1 = 0, row3 = n - 1,row2=0;
        //�еķ�Χ
        int column1 = 0, column3 = n - 1,column2=0;
        //ÿ��ѭ�����־���ȡС��һ��
        while (row1 <=row3 && column1 <=column3) {
            count++;
            row2 = row1 + (row3 - row1) / 2;
            column2 = column1 + (column3 - column1) / 2;
            //ǰ�ĸ��ж����ĵ�һ��������Ϊ�˷�ֹ����Խ��
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
        //���󳤶�n
        int n=10;
        List<Integer> list=new LinkedList<>();
        int[][] a=new int[n][n];
        for(int i=0;i<n*n;i++){list.add(i);}
        //����
        Collections.shuffle(list);
        //����n*n�ľ���
        Iterator<Integer> it=list.iterator();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                a[i][j]=it.next();
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }
        System.out.print("�ֲ���Сֵ���С���������");
        for(int x:localMin(a)){System.out.print(x+" ");}
        System.out.println("\nִ����"+count+"��ѭ��");
    }
}
