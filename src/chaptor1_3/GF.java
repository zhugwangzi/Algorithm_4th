package chaptor1_3;
public class GF {
    public static int reverse(int x) {
        if(x==0){
            return x;
        }
        String str=""+x;
        String[] s1=str.split("");   
        String s2="";
        if(x<0){
        	
         s2="-";
        }
        int N=0;
        for(int i=s1.length-1;i>=0;i--){
            if(s1[i].equals("-")){
                break;
            }else if(N==0&&s1[i].equals("0")){
               continue;
            }else{
                s2+=s1[i];
                N++;
            }
        }
        long n=Long.parseLong(s2);
        if(n>Integer.MAX_VALUE||n<Integer.MIN_VALUE){
            return 0;
        }
        return Integer.parseInt(s2);
    }
    public static void main(String[] args) {
		System.out.println(reverse(2349723));
	}
}