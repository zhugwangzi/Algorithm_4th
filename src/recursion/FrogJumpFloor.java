package recursion;
/*
*青蛙跳台阶问题：
*有n级台阶，青蛙每次可以跳1或2级台阶
*求有1~10级台阶各有几种跳法
*/
public class FrogJumpFloor {
	/*n级台阶每次可以跳1或2级，假如跳1级还剩f(n-1)种方法，
	 * 假如跳2级还剩f(n-2)种跳法,因此f(n)=f(n-1)+f(n-2) 
	 */
	public static int f(int n) {
		if(n<=2) {//基准条件,注意n=1,2才是基准
			return n;
		}
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			System.out.println(i+"级台阶有"+f(i)+"种跳法");
		}
	}
}
