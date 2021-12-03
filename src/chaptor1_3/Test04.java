<<<<<<< HEAD
package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test04 {
	public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
            	
            	if(stack.isEmpty()||!match(stack.pop(),c)) {return false;}        		
            }
        }
        return stack.isEmpty();
    }
    public static boolean match(char c1,char c2){
        if(c1=='('&&c2==')'){ return true;}
        if(c1=='['&&c2==']'){ return true;}
        if(c1=='{'&&c2=='}'){ return true;}
        return false;
    }
	public static void main(String[] args) {
		System.out.println("ÊäÈëº¬ÓÐ (){}[] µÄ×Ö·û´®:");
		String str=StdIn.readLine();
		System.out.println(isValid(str));
	}
}
=======
package chaptor1_3;
import edu.princeton.cs.algs4.*;
public class Test04 {
	public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
            	
            	if(stack.isEmpty()||!match(stack.pop(),c)) {return false;}        		
            }
        }
        return stack.isEmpty();
    }
    public static boolean match(char c1,char c2){
        if(c1=='('&&c2==')'){ return true;}
        if(c1=='['&&c2==']'){ return true;}
        if(c1=='{'&&c2=='}'){ return true;}
        return false;
    }
	public static void main(String[] args) {
		System.out.println("è¾“å…¥å­—ç¬¦ä¸²:");
		String str=StdIn.readLine();
		System.out.println(isValid(str));
	}
}
>>>>>>> 202976f3c5e3b649e616edd6dc61ecc7070802cb
