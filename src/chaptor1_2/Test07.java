package chaptor1_2;
public class Test07 {
	public static String reverseString(String s) {
		int n=s.length();
		if(n<=1) {
			return s;
		}
		return reverseString(s.substring(n/2,n))+reverseString(s.substring(0,n/2));
	}
	public static void main(String[] args) {
		String s=new String("wef 13r");
		System.out.println(reverseString(s));
	}
}
