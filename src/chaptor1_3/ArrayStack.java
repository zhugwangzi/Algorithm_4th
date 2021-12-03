package chaptor1_3;
import java.util.Iterator;
import edu.princeton.cs.algs4.*;
//用数组实现的栈
public class ArrayStack<E> implements Iterable<E>{
	private E[] a=(E[]) new Object[1];
	private int N=0;
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	private void resize(int max) {//扩充数组长度为max
		E[] temp=(E[]) new Object[max];
		for(int i=0;i<N;i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	public void push(E e) {
		if(N==a.length) {
			resize(2*a.length);
		}
		a[N++]=e;
	}
	public E pop() {
		E e=a[--N];
		a[N]=null;
		if(N<=a.length/4) {
			resize(a.length/2);
		}
		return e;
	}
	public Iterator<E> iterator(){
		return new ReverseArrayIterator();
	}
	private class ReverseArrayIterator implements Iterator<E>{
		private int i=N;
		public boolean hasNext() {
			return i>0;
		}
		public E next() {
			return a[--i];
		}
		public void remove() {};
	}
}
