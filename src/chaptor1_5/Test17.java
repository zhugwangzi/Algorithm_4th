package chaptor1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @Classname Test17
 * @Description 动态连通性
 * @Author zhug
 * @Date 2021/12/9 1:09
 * @ModifyDate 2021/12/9 1:09
 * @Version 1.0
 */
public class Test17 {
    //父节点数组,id[i]是i的父节点
    public static int[] id;
    //容量数组，size[i]是以i为父节点的树的大小
    public static int[] size;
    //触点数量,触点名0~n-1
    public static int n;
    //初始化触点,id[],size[]
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
    //加权quick-union，比较树的大小再把小树链接到大树
    public static void union(int p,int q){
        int proot=find(p);
        int qroot=find(q);
        //小树链接到大树
        if(size[proot]<size[qroot]){
            id[proot]=qroot;
            size[qroot]+=size[proot];
        }else{
            id[qroot]=proot;
            size[proot]+=size[qroot];
        }
    }
    public static int count(int n){
        //链接总数
        int count=0;
        new Test17(n);
        boolean flag=true;
        //触点i
        int i=0;
        while (i<n-1){
            while(i<n-1) {
                if(connected(i,i+1)){i++;}
                else {break;}
            }
            int p=StdRandom.uniform(n);
            int q=StdRandom.uniform(n);
            count++;
            System.out.println("随机整数对："+p+","+q);
            if (!connected(p,q)){union(p,q);}
        }
        //因为是随机连接对，每次运行结果不一定一样
        return count;
    }
    public static void main(String[] args) {
        System.out.print("输入整数：");
        int n=StdIn.readInt();
        System.out.println("链接总数："+count(n));

    }
}
