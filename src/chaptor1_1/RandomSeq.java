package chaptor1_1;
public class RandomSeq{
	public static double f(int n) {
		if(n>1) {
			return f(n-1)+Math.log(n);
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(f(2));
	}
}