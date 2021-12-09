package chaptor1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @Classname Test17
 * @Description ��̬��ͨ��
 * @Author zhug
 * @Date 2021/12/9 1:09
 * @ModifyDate 2021/12/9 1:09
 * @Version 1.0
 */
public class Test17 {
    //���ڵ�����,id[i]��i�ĸ��ڵ�
    public static int[] id;
    //�������飬size[i]����iΪ���ڵ�����Ĵ�С
    public static int[] size;
    //��������,������0~n-1
    public static int n;
    //��ʼ������,id[],size[]
    public Test17(int n){
        id=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){size[i]=1;id[i]=i;}
    }
    public static boolean connected(int p,int q){
        return find(p)==find(q);
    }
    public static int find(int p){
        while(p!=id[p]){p=id[p];}
        return p;
    }
    //��Ȩquick-union���Ƚ����Ĵ�С�ٰ�С�����ӵ�����
    public static void union(int p,int q){
        int proot=find(p);
        int qroot=find(q);
        //С�����ӵ�����
        if(size[proot]<size[qroot]){
            id[proot]=qroot;
            size[qroot]+=size[proot];
        }else{
            id[qroot]=proot;
            size[proot]+=size[qroot];
        }
    }
    public static int count(int n){
        //��������
        int count=0;
        new Test17(n);
        boolean flag=true;
        //����i
        int i=0;
        while (i<n-1){
            while(i<n-1) {
                if(connected(i,i+1)){i++;}
                else {break;}
            }
            int p=StdRandom.uniform(n);
            int q=StdRandom.uniform(n);
            count++;
            System.out.println("��������ԣ�"+p+","+q);
            if (!connected(p,q)){union(p,q);}
        }
        //��Ϊ��������Ӷԣ�ÿ�����н����һ��һ��
        return count;
    }
    public static void main(String[] args) {
        System.out.print("����������");
        int n=StdIn.readInt();
        System.out.println("����������"+count(n));

    }
}
